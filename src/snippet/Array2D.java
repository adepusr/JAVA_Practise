package snippet;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
	static int arr[][] = {{0,-4,-6, 0,-7,-6}, {-1,-2,-6,-8,-3,-1}, {-8,-4,-2,-8,-8,-6}, {-3,-1,-2,-5,-7,-4}, {-3,-5,-3,-6,-6,-6}, {-3,-6,0,-8,-6,-7} };
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int ar2[][] = new int[6][6];
		 int[] sum=new int[16];
		 for(int i=0; i < 6; i++){
		    for(int j=0; j < 6; j++){
		    	
		        arr[i][j]=in.nextInt();
		        
		    }
		 }  		  
		 int count=0;
		 for(int i=0;i<6-2;i++)
		 {
			 for(int j=0;j<6-2;j++)
			 {
				 sum[count]=hourGlassVal(i,j,arr );
				 count++;
			 }
		 }
		 Arrays.sort(sum);
		 System.out.println(sum[15]);
	}

	private static int hourGlassVal(int i, int j, int[][] arr2) {
		int val= arr2[i][j]+arr2[i][j+1]+arr2[i][j+2]+arr2[i+1][j+1]+arr2[i+2][j]+arr2[i+2][j+1]+arr2[i+2][j+2];
		return val;
	}
}
