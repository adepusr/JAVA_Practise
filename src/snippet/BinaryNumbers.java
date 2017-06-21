package snippet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        String s= Integer.toBinaryString(n);
        System.out.println(s);
        char[] c=s.toCharArray();
        
		ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<c.length;i++)
        {
        	if(c[i]=='1')
        		count++;        		
        	else 
        	{
        		if(count!=0)
        		l.add(count);
        		count=0;
        	}
        	if(i==c.length-1 && count>0)
        		l.add(count);    		
        }
        Collections.sort(l);
        System.out.println(l.remove(l.size()-1));
	}

}
