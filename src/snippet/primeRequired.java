package snippet;

public class primeRequired {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		for(int i=2;i<=100;i++)
		{
			count=0;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==0)
			{
				System.out.println("PRIME: "+print(i));
			}
		}
	}

	private static int print(int i) {
		// TODO Auto-generated method stub
			int a=i;
			return a;
	}
}