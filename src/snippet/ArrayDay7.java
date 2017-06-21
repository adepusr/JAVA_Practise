package snippet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import com.mysql.jdbc.StringUtils;
import com.sun.xml.internal.bind.v2.model.util.ArrayInfoUtil;

public class ArrayDay7 {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i=0; i < n; i++){
	            arr[i] = in.nextInt();
	            
	        }
	        for(int i=0,j=n-1;i<j;i++,j--)
	        {
	        	int a=arr[i];
	        	arr[i]=arr[j];
	        	arr[j]=a;
	        }
	       // System.out.println(arr[0]);
	        for(int i=0;i<n;System.out.print(arr[i]+" "),i++)
	        in.close();
	    }

}