package ttt;

public class hyjl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =123454756,r=0;
		String s="";
		while(i>0){
			r= i%10;
			i = i/10;
			if(r%2!=0){
				r++;
			}
			s = r+ s;
		}
		System.out.print(Integer.parseInt(s));
	}

}
