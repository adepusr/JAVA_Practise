package snippet;

public class CheckingList {

	public static void main(String[] args) {
		int nam = 0;
		String name="",append="";
		//read image file
		for(int i=0;i<=1328;i++)
		{
			append="";
			nam++;
			name=Integer.toString(nam);
			if(name.length()!=6)
			{
				for(int j=0;j<6-name.length();j++)
				{
					append+="0";
				}
				append +=name;
			}

			System.out.println(append);
		}
	}

}
