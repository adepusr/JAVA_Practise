package snippet;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagram {
		    public static int numberNeeded(String first, String second) {
		    	ArrayList<Character> al1=new ArrayList<Character>();
		    	ArrayList<Character> al2=new ArrayList<Character>();
		    	char[] f=first.toCharArray();
		    	char[] s= second.toCharArray();
		    	for (int i=0;i<f.length;i++) {
		    		  al1.add(f[i]);
		    	}
		    	for (int i=0;i<s.length;i++) {
		    		  al2.add(s[i]);
		    	}
		    	for(int i=0;i<al1.size();i++)
		    	{
		    		for (int j=0;j<al2.size();j++) 
		    		{		    			
		    			System.out.println(al1.get(i)+"=="+al2.get(j)+"  i:"+i+" j:"+j);
		    			if(al1.get(i).equals(al2.get(j)))
		    			{
		    			  al1.remove(i);
		    			  al2.remove(j);
		    			  i=0;j=0;
		    			}
		    			System.out.println(al1+"   "+al2);
		    		}
		    	}
		    	return al1.size()+al2.size();
		    }
		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        String a = in.next();
		        String b = in.next();
		        System.out.println(numberNeeded(a, b));
		    }
		}