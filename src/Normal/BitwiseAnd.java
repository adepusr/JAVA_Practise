package Normal;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BitwiseAnd {
	 public static void main(String[] args) {
		    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc= new Scanner(System.in);
	        int T = sc.nextInt();
			for (int tc = 0; tc < T; tc++) {
				int N = sc.nextInt();
				int K = sc.nextInt();
				System.out.println(solve(N, K));
			}
	    }
	    public static int solve(int n, int k){
         int res =0;
				for(int i=1; i<=n;i++){
	            	for(int j=i+1; j <= n;j++){
	            		int val = i &j;
	            		if(val < k && res <val ){
                         res= val;
	            		}
	            	}
	            }
	            
	            return res;
	    }
}
