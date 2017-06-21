package snippet;

import java.util.Scanner;

public class PermutationsPali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();	
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
			{
				s1 +=s.charAt(i);
			}
		}
		permutation(s1);
		
	}
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) 
	    {
	    	//System.out.println(prefix);
	    	palindrome(prefix);
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	private static void palindrome(String prefix) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder(prefix);
		String s=sb.reverse().toString();
		if(s.equals(prefix))
		{
			System.out.println(" "+prefix);
		}
	}
}
