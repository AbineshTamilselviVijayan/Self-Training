import java.util.*;
class prime
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter a number ... !");
		int x = s.nextInt();
		int a = 0;
		if (x==0 || x==1)
		{
			System.out.println("The entered number is neither prime nor composite");
		}
		else
		{
			for (int i=1;i<=x;i++)
			{
				if (x%i==0)
				{
					System.out.println(i);
					a++;
				}
			}
			System.out.println(a);
			if (a==2)
			{
				System.out.println("The entered number is prime");
			}
			else
			{
				System.out.println("The entered number is composite");
			}
		}
	}
}
