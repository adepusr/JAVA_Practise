package snippet;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		int count=0;
		for(int i=97;i<124;i++)
		{
			char cs= (char)i;
			String cs2= Character.toString(cs);
			if(str.contains(cs2))
			{
				count++;
			}
				
		}
		if(count==26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}

}
