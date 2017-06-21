package snippet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class LiveRampTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1, 8, 6, 5, 5, 8, 9};
		System.out.println(solution(a));
	}

	private static int solution(int[] a) {
		// TODO Auto-generated method stub
		int t=0,n=a.length; ;
		int p[] = new int[n];
		Set<Integer> h = new HashSet<Integer>();  
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i] >a[j])
				{
					t=a[i+1];
					a[i+1]=a[i];
					a[i]=t;
					h.add(i);
					h.add(j);
				}
			}
		}
		return h.size();
	}

}
