package snippet;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class PureStorageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] st={"ACQUIRE 83", "ACQUIRE 92", "RELEASE 92", "ACQUIRE 102", "RELEASE 102","RELEASE 83"};
		prob(st);
	}

	private static void prob(String[] st) {
		// TODO Auto-generated method stub
		char[] sp;
		ArrayList<Integer> aquire=new ArrayList<Integer>();
		ArrayList<Integer> release=new ArrayList<Integer>();
		StringTokenizer stt=null;
		for(int i=0;i<st.length;i++)
		{
			 sp = st[i].toCharArray();
			 stt=new StringTokenizer(st[i]," ");
			 while (stt.hasMoreElements()) {
				 String s=(String) stt.nextElement();
				 
				 int pp=Integer.parseInt((String) stt.nextElement());
				 System.out.println("--> "+s+"  ="+pp);
				 	if(s.equals("ACQUIRE"))
				 	{
				 		aquire.add(pp);
				 	}
				 	else{
				 		if(s.equals("RELEASE"))
				 			release.add(pp);
				 	}
					
				}			 
		}
		System.out.println(aquire);
		System.out.println(release);
	}

}
