package snippet;

import java.util.Scanner;

public class FactorialDay9 {
	static int prod=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		System.out.println(factorial(val));
	}

	private static int factorial(int val) {
		// TODO Auto-generated method stub
		if(val != 0)
		{
			prod *=val;
			factorial(val-1);
		}
		return prod;
	}

}
