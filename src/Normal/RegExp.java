package Normal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] str=new String[N];
        
        int i=0;
        Pattern p = Pattern.compile("@gmail.com");  
        ArrayList<String> arr=new ArrayList();
        Matcher m;
        for(int a0 = 0; a0 < N; a0++)
        {
            String firstName = in.next();
            String emailID = in.next();
            m=p.matcher(emailID);
            if(m.find())
                  arr.add(firstName.toLowerCase());        
        }
        Collections.sort(arr);
        
        for(String s:arr)
        {
            System.out.println(s);    
        
        }
    }

}
