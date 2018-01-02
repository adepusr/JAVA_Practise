package Random;

import java.util.ArrayList;

public class StringCompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ar={'a','a','b', 'b','c','c', 'c'};
		int len = getNumber(ar);
		System.out.println(len);
	}

	private static int getNumber(char[] chars) {
		// TODO Auto-generated method stub	
		ArrayList<Character> ar= new ArrayList<>();
		for(char c : chars) {
		    ar.add(c);
		}
		ArrayList<Character> test = new ArrayList<>();		
		int count=0, j=0,i=0;
		while(ar.size() !=0){
			char pivot=ar.get(i);
			test.add(pivot);
			j=0;
			while(j < ar.size()){
				if(pivot == ar.get(j)){
					ar.remove(j);
					count++;
				}else{
					j++;					
				}
			}
			if(count > 1){
				if(count > 9)
				{
					String s= Integer.toString(count);
					for(int ln=0; ln < s.length(); ln++){
						test.add(s.charAt(ln));
					}
				}else{
					test.add(Character.forDigit(count, 10));					
				}
				i=0;				
			}else{
				if(count == 0){
					ar.remove(i);					
				}
			}
			count=0;
		}
		System.out.println(test);
		return test.size();
	}
}
