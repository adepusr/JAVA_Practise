package snippet;

import java.util.Scanner;

public class LiveRamp {

	
	 public static int solution(int[] A) {
	        // write your code in Java SE 8
	        int val=0, sum1=0, sum2=0;
	        int n=A.length;
	        for(int p=0;p<n;p++)
	        {
	        	sum1=sum2=0;
	            if(p!=n-1)
	            	for(int i=p+1;i<n;sum2+=A[i],i++);
	            else sum2=0;
	            if(p!=0)
	            	for(int i=0;i<p;sum1+=A[i],i++);
	            else sum1=0;
	            if(sum1==sum2)
	            	return p;
	        }
	        return -1;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={-2, 3, -4, 5, 1, -6, 2, 1};
		System.out.println("  -- "+solution(a));
		}

}
