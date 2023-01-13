import java.util.*;
class specialnum 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to validate");
		int a = s.nextInt();
		if (a==sum(a))
		{
			System.out.println("It is a special number");
		}
		else
		{
			System.out.println("It is not a special number");
		}
	}
	public static int sum(int x)
	{
		int j = 0;
		int k = 0;
		while (x>0)
		{
			j=x%10;
			k+=fact(j);
			x=x/10;
		}
		return k;
	}
	public static int fact(int y)
	{
		int i = 1;
		while (y>0)
		{
			i*=y;
			y--;
		}
		return i;
	}
}
