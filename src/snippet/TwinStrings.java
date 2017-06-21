package snippet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TwinStrings {

	public static void main(String[] args) throws IOException {
Scanner sc=new Scanner(System.in);
		
        int len=sc.nextInt();
        String sam[]=new String[len];
        String sr1= sc.nextLine();
        String s=null;
        String s1 ="",s2 = "";
		for(int i=0;i<len;i++)
            {
            String sr= sc.nextLine();
			//BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
			//s=br.readLine();
            s1 ="";s2 ="";          
            char a[]= sr.toCharArray();          
            for(int j=0;j<a.length;j++)
                {
                if(j%2==0)    	
                	s1+=a[j];
                else
                    s2+=a[j];
            }
            sam[i]=""+s1+ " "+s2;
            }
		  for(int i=0;i<sam.length;i++)
            System.out.println(sam[i]);
	}
}
