package Normal;

import java.util.LinkedList;
import java.util.Scanner;

public class LonlyInteger {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> h= new LinkedList<Integer>();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int count=0;
        for(int i=0; i< a.length; i++){
            count ^=a[i];
        }
        System.out.println(count);
    }
}
