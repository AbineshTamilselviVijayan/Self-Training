import java.util.*;
class strongnum
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int a = s.nextInt();
		int sum = 0;
		int c = a;
		int temp = 0;
		while (c>0)
		{
			temp = c%10;
			sum+=fact(temp);
			c=c/10;
		}
		if (sum==a)
		{
			System.out.println("The input is a strong number");
		}
		else
		{
			System.out.println("The input is not a strong number");
		}
	}
	public static int fact(int x)
	{
		int m = x;
		int g = 1;
		for (int i = m;i>0;i--)
		{
			g*=i;
		}
		return g;
	}
}
