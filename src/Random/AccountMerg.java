package Random;

import java.util.ArrayList;
import java.util.Arrays;

public class AccountMerg {
	static ArrayList<ArrayList> mainArray= new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList> ar= new ArrayList<ArrayList>();
		ArrayList<String> e=new ArrayList<>();
		e.add("John");
		e.add("johnsmith@mail.com");
		e.add("john00@mail.com");
		ar.add(e);
		ArrayList<String> e2=new ArrayList<>();
		e2.add("John");
		e2.add("johnsmith@mail.com");
		ar.add(e2);
		ArrayList<String> e5=new ArrayList<>();
		e5.add("John");
		e5.add("johnsmith@mail.com");
		ar.add(e5);
		ArrayList<String> e4=new ArrayList<>();
		e4.add("Tempo");
		e4.add("johnnyo@mail.com");
		ar.add(e4);
		merger(ar);
		System.out.println(mainArray);
	}

	private static void merger(ArrayList<ArrayList> ar) {
		// TODO Auto-generated method stub
		int i=0;
		for(i=0; i< ar.size()-1; i++){
			for(int j=1; j< ar.size(); j++){
				ArrayList<String> per= new ArrayList<>(ar.get(j));	
					if(per.get(0) == ar.get(i).get(0)){
						matched(per, ar.get(i));
					}
			}
			mainArray.add(ar.get(i));
		}
	}

	private static void matched(ArrayList<String> per, ArrayList<String> main) {
		// TODO Auto-generated method stub
		int x=1;
		boolean match= false;
		while(x <main.size()){
			int y=1;
			while(y< per.size()){
				if(main.get(x)== per.get(y)){
					match= true;
					break;
				}
				y++;
			}
			x++;
		}
		if(match){
			mainmerge(per, main);
		}
	}

	private static void mainmerge(ArrayList<String> per, ArrayList<String> main) {
		// TODO Auto-generated method stub
		int x=1;
		while(x< main.size()){
			if(!per.contains(main.get(x))){
				per.add(main.get(x));
			}
			x++;
		}
		mainArray.add(per);
	}

}
