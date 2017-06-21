package snippet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashTables {
	static int n;
	static int m;
		Map<Integer, String> magazineMap;
	    Map<Integer, String> noteMap;	    
	    public HashTables(String magazine, String note) {
	        magazineMap= new HashMap<Integer, String>();
	        noteMap= new HashMap<Integer, String>();
	        StringTokenizer st1=new StringTokenizer(magazine, " ");
	        StringTokenizer st2=new StringTokenizer(note, " ");
	        int count=0;
	        while(st1.hasMoreTokens())
	        {
	        	magazineMap.put(count,(String) st1.nextElement());
	        	count++;
	        }
        	System.out.println(magazineMap);
	        count=0;
	        while(st2.hasMoreTokens())
	        {
	        	noteMap.put(count,(String) st2.nextElement());
	        	count++;
	        }
        	System.out.println(noteMap);
        	
}
	    
	    public boolean solve() {
			return false;	        
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	         m = scanner.nextInt();
	         n = scanner.nextInt();	        	        
	        scanner.nextLine();	        
	        HashTables s = new HashTables(scanner.nextLine(), scanner.nextLine());
	        scanner.close();
	        
	        boolean answer = s.solve();
	        if(answer)
	            System.out.println("Yes");
	        else System.out.println("No");
	      
	    }
	}
