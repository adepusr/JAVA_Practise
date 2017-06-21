package snippet;

import java.util.Scanner;

public class Sherlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        char in[]=input.toCharArray();
        int len=in.length;
        int c,same=0;
        int count[]=new int[len];
        for(int i=0;i<len;i++)
        {
        	c=0;
        	for(int j=i+1;j<len-1;j++)
        	{	
           		if(in[i]==in[j])
        		{	
        			c++;
        			count[i]=c;
        		}
        	}
        }
        for(int i=0;i<len-1;i++)
        {
        	if(count[i]==count[i+1])
        		same++;
        }
        if(same==len-1)
        	System.out.println("YES");
        else
        	System.out.println("NO");
	}
}
