import java.util.*;
class twistedprime
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the starting range");
		int a = s.nextInt();
		System.out.println("Enter the starting range");
		int b = s.nextInt();
		for (int x = a;x<=b;x++)
		{
			if (isprime(x) && isprime(reverse(x)))
			{
				System.out.println(x+" is a twisted prime");
			}
		}
	}
	public static boolean isprime(int m)
	{
		int n = 0;
		for (int i = 1;i<=m;i++)
		{
			if (m%i==0)
			{
				n++;
			}
		}
		if (n==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int reverse(int o)
	{
		int j = 0;
		int l = o;
		int y = 0;
		while (l>0)
		{
			j=l%10;
			y=(y*10)+j;
			l=l/10;
		}
		return y;
	}
}
