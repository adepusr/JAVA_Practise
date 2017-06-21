package snippet;

import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackPure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		String[] st={"ACQUIRE 123","ACQUIRE 364", "ACQUIRE 84", "RELEASE 84", "RELEASE 364", "ACQUIRE 789", "RELEASE 456", "RELEASE 123"};

		String[] st={"ACQUIRE 364", "ACQUIRE 84", "ACQUIRE 364", "RELEASE 364"};
		prob(st);
	}
	
	private static void prob(String[] st) {
		Stack<Integer> ls=new Stack<Integer>();
		StringTokenizer stt=null;
		char[] sp ;
		for(int i=0;i<st.length;i++)
		{
			sp= st[i].toCharArray();
			 stt=new StringTokenizer(st[i]," ");
			 while (stt.hasMoreElements()) {
				 String s=(String) stt.nextElement();
				 
				 int pp=Integer.parseInt((String) stt.nextElement());
				// System.out.println("--> "+s+"  ="+pp);
				 if(s.equals("ACQUIRE"))
				 	{
				 		ls.push(pp);
				 	}
				 	else{
				 		if(s.equals("RELEASE"))
				 		{
				 			if(ls.get(ls.size()-1)==pp)
				 			{
				 				ls.pop();
				 			}
				 			else
				 			{
				 				System.out.println("error "+(i+1));
				 				System.exit(1);
				 			}
				 		}
		
				 	}
			 	}
			 
		}
		if(ls.size()==0)
		System.out.println("correct ");
		else
			System.out.println("Error "+(ls.size()+1));
	}
}

	
