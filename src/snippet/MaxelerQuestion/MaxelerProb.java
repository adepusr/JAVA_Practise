package snippet.MaxelerQuestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MaxelerProb {
	
	public static  int sp=0;
	public static int ip=0;
	public static String[] data;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String line;
		String  instruction_size=null;
		int i=0;
		File f=new File("C:\\Users\\adepu\\workspace\\Practise_Samples\\src\\snippet\\MaxelerQuestion\\test25.bin");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String data_size=br.readLine();
		sp=Integer.parseInt(data_size,16)-1;
		data=new String[Integer.parseInt(data_size,16)];
		while((line=br.readLine())!=null)
		{
				data[i] = line;
			    i++;
			
		}
		for(ip = 0; ip< data.length;ip++)
		{
			decode(data[ip]);
		}
	}
	private static void decode(String instruction_size) {
		// TODO Auto-generated method stub
		String instruction=instruction_size.toUpperCase();
		char a[]= instruction.toCharArray();
		String c = "";
		for(int i=0;i<a.length;i++){
			int dec = Integer.parseInt(""+instruction.charAt(i),16);
		    String b = Integer.toBinaryString(dec);
		    while(b.length() < 4){
             b = "0" + b;
              }
		     c = c.concat(b);
		}
	     if(c.charAt(0)=='0')
	     {
	    	 binop0(c);
	     }
	     else
	    	 binop1(c);
        }
	private static void binop1(String c) {
		int b = Integer.parseInt(g(),16);
		int a = Integer.parseInt(g(),16);
		int opi= Integer.parseInt(c.substring(1,8),2);
		switch(opi)
		{
		case 0: 
			f(Integer.toString((a + b),16));
			break;
		case 1: 
			//sub();
			f(Integer.toString((a - b),16));
			break;
		case 2: 
			f(Integer.toString((a * b),16));
			break;
		case 3: 
			//div();
			f(Integer.toString((a / b),16));
			break;
		case 4: 
			f(Integer.toString((a & b),16));
			break;
		case 5: 
			f(Integer.toString((a | b),16));
			break;
		case 6: 
			f(Integer.toString((a ^ b),16));
			break;
		case 7: 
			if(a-b==0)
			{
			f(Integer.toString(1,16));
			}
			else
				f(Integer.toString(0,16));
			break;
		case 8: 
			if(a<b)
			{
			f(Integer.toString(1,16));
			}
			else
				f(Integer.toString(0,16));
			break;
			default:
				System.out.print("Wrong input  .");
		}
	}
	private static void binop0(String c) {
		String addr,st_data,cond;
		String opcode=c.substring(1,8);
		String opdata=c.substring(9, 32);
		int op=Integer.parseInt(opcode,2);
		int opd=Integer.parseInt(opdata,2);
		String hxpd=Integer.toString(opd,16);
		switch(op)
		{
		case 0: 
			sp = sp + 1;
			break;
		case 1: 
			f(hxpd);
			break;
		case 2: 
			f(Integer.toString(ip,16));
			break;
		case 3: 
			f(Integer.toString(sp,16));
			break;
		case 4: 
			addr = g();
			f(data[Integer.parseInt(addr,16)]);
			break;
		case 5: 
			st_data = g();
			addr = g();
			data[Integer.parseInt(addr,16)] = st_data;
			break;
		case 6: 
			cond = g();
			addr = g();
			//System.out.println(cond);
			if(Integer.parseInt(cond,16) !=0)
				ip = Integer.parseInt(addr,16);
			break;
		case 7: 
			if(Integer.parseInt(g(),16) !=0)
				f("00000000");
			else
				f("00000001");
			break;
		case 8: 
			System.out.println(ip+" "+sp);
			System.out.println((char)(Integer.parseInt(g(),16) & 0xFF));
			break;
		case 9:
			Scanner sc=new Scanner(System.in);
			Byte b=new Byte(sc.nextByte());
			int bb=b.intValue();
			f(Integer.toString((bb & 0xFF),16));
			break;
		case 10: 
			System.exit(1);
			break;
		default:
				System.out.print("Wrong input.");
				break;
		}
	}
	public static void f(String v)
	{
		sp = sp - 1;
		data[sp] = v;
	}
	public static String g()
	{
		String v;
		v = data[sp];
		sp = sp + 1;
		return v;
	}
}
