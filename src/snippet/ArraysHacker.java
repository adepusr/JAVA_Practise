package snippet;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysHacker {

	    static int maxXor(int l, int r) {
	    	int t=r-l+1;
	    	int len= getLength(t);
	    	int val[] = new int[len];
	    	int p = 0;
	    	for(int i=l;i<=r;i++)
	    	{
	    		for(int j=i;j<=r;j++)
	    		{
	    			val[p]=i ^ j;
	    			p++;
	    		}
	    	}
	    	Arrays.sort(val);	    	
	    	return val[val.length-1];
	    }

	    private static int getLength(int t) {
	    	int sum=0;
	    	while(t>=1)
	    	{
	    		sum +=t;
	    		t--;
	    	}
			return sum;
		}

		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int res;
	        int _l;
	        _l = Integer.parseInt(in.nextLine());
	        int _r;
	        _r = Integer.parseInt(in.nextLine());	        
	        res = maxXor(_l, _r);
	        System.out.println(res);
	        
	    }
	}