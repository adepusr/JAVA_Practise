package snippet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapDay8 {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map <String,Integer> map=new HashMap<String,Integer>();
        int n = in.nextInt(),c=0;
        String s2="";
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            c=0;
            int val=0;
            for(Map.Entry<String,Integer> me: map.entrySet())
            {
            	s2=me.getKey();
            	if(s2.equals(s))
            		c=1;
            }
            /*if(c==1)
            {
            	val=map.get(s);
            	System.out.println(s+"="+val);
            }
            else 
            	System.out.println("NOT FOUND");*/
            try{
            	val=map.get(s);
            	System.out.println(s+"="+val);
            }catch(Exception e)
            {
            	System.out.println("NOT FOUND");
            }
        }
            
        in.close();
    }
}
