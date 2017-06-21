package snippet;

public class Snippet {
	public static void main(String args[])
	{
	int threediv=0, sevendiv=0;
		for(int i=1;i<=100;i++)
		{
			threediv=i%3;
			sevendiv=i%7;
			if(threediv==0 && sevendiv==0)
					System.out.println("OnBase"+i);
			else
			{
				if(threediv==0)
					System.out.println("On"+i);
				else
				{
					if(sevendiv==0)
						System.out.println("Base"+i);
				}
			}
		}
	}
}


