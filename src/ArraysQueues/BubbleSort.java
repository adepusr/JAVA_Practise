package ArraysQueues;
import java.io.*;
import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int swapCount=0;
        for(int i=0;i< a.length;i++){
        	int count=0;
        	for(int j=0; j<a.length-1; j++){
        		if(a[j+1]< a[j]){
        			swapCount++;
        			count++;
        			int b= a[j+1];
        			a[j+1]= a[j];
        			a[j]= b;
        		}
        	}
        	if(count == 0){
        		break;
        	}
        }
        System.out.println("Array is sorted in "+swapCount+" swaps");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}
