package snippet;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String to reverse: ");
		String input=sc.nextLine();
		System.out.println("REVERSED String: ");
		StringBuilder sb=new StringBuilder(input);
		sb.reverse().toString();
	}
}
