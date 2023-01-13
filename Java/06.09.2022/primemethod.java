import java.util.*;
class primemethod
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number ... !");
		int x = s.nextInt();
		porc(x);
	}
	public static int porc(int y)
	{
		int a = 0;
		for (int i = 1;i<=y;i++)
		{
			if (y%i==0)
			{
				a++;
			}
		}
		System.out.println(a);
		if ((y==0) || (y==1))
		{
			System.out.println("The entered number is neither prime nor composite");
		}
		else if (a==2)
		{
			System.out.println("The entered number is PRIME");
		}
		else
		{
			System.out.println("The entered number is COMPOSITE");
		}
		return a;
	}
}
