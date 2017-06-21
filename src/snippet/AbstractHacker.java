package snippet;

import java.util.Scanner;

public class AbstractHacker {

	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        String S = in.next();
		        try{
		        int i= Integer.parseInt(S);
		               System.out.println(""+i);
		        }
		        catch(Exception e){
		            System.out.println("Wrong input");
		        }
		    }

}
