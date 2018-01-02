package Normal;

import java.util.ArrayList;
import java.util.Scanner;

public class contactList2 {

	    public static ArrayList<String> ar= new ArrayList<String>();

		 public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		        for(int a0 = 0; a0 < n; a0++){
		            String op = in.next();
		            String contact = in.next();
		            result(op, contact);
		        }
		    }

		private static void result(String op, String contact) {
			// TODO Auto-generated method stub
			switch(op.toLowerCase().trim()){
			case "add": addingContact(contact);break;
			case "find": findContact(contact); break;
			}
		}

		private static void findContact(String contact) {
			// TODO Auto-generated method stub
			int count=0;
			for(int i=0; i<ar.size(); i++){
				if(ar.get(i).contains(contact)){
					count++;
				}
			}
			System.out.println(count);
		}

		private static void addingContact(String contact) {
			// TODO Auto-generated method stub
			ar.add(contact.toLowerCase().trim());
		}
}
