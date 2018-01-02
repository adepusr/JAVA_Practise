package Normal;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class Ransom_note {

	 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Hashtable<String,Integer> ht= new Hashtable<String,Integer>();
        Hashtable<String,Integer> ht2= new Hashtable<String,Integer>();
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            String s = in.next();
            if(ht.containsKey(s))
        		ht.put(s,ht.get(s)+1);
        	else{
        		ht.put(s,1);	        		
        	}
        }
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            String s = in.next();
            if(ht2.containsKey(s))
        		ht2.put(s,ht2.get(s)+1);
        	else{
        		ht2.put(s,1);	        		
        	}
        }
        //System.out.println(ht);
        //System.out.println(ht2);
        System.out.println(result(ht, ht2));
    }

	private static String result(Hashtable<String, Integer> ht, Hashtable<String, Integer> ht2) {
		// TODO Auto-generated method stub
		Set<String> keys = ht2.keySet();
        for(String key: keys){
        	if(ht.containsKey(key)){
            	if( ht2.get(key) > ht.get(key)){
            		return "NO";
            	}
        	}
        }
        return "YES";
		
	}
}
