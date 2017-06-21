package snippet;

import java.util.Arrays;

public class CoxTest {
	static int sum=0;
	public static void main(String[] args)  {
		int a[] = {1,2,3};
		int tot=costreduce(a);
		System.out.println("Sum:  "+tot);
	}
	private static int costreduce(int[] a) {
		Arrays.sort(a);
		int min1 = a[0];
		int min2 = a[1];
		sum+=min1+min2;
		int[] a2 = Arrays.copyOfRange(a, 2, a.length);
		int a3[] = append(a2, min1+min2);
		if(a3.length>1)
			costreduce(a3);
		return sum;					
	}
	private static int[] append(int[] a2, int i) {
		final int N = a2.length;
	    a2 = Arrays.copyOf(a2, N + 1);
		a2[N] = i;
	    return a2;
	}
   
}
