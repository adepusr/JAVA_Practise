package snippet;

import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Length: ");
		char[] data={'a','b','c'};
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int total =(int) Math.pow(3, len);
		System.out.println("TOTAL combinations: "+total);
		
	}


}
