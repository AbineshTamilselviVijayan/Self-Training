import java.util.*;
class spynum 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to check");
		int a = s.nextInt();
		if ((sum(a))==(prod(a)))
		{
			System.out.println("It is a spy number");
		}
		else
		{
			System.out.println("It is not a spy number");
		}
	}
	public static int sum(int x)
	{
		int m,n = 0;
		while (x>0)
		{
			m = x%10;
			n+=m;
			x=x/10;
		}
		return n;
	}
	public static int prod(int y)
	{
		int i = 1;
		int k = 0;
		while (y>0)
		{
			k = y%10;
			i*=k;
			y=y/10;
		}
		return i;
	}
}
