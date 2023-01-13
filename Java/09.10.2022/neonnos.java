import java.util.*;
class neonnos
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the starting range");
		int a = s.nextInt();
		System.out.println("Enter the ending range");
		int b = s.nextInt();
		for (int i = a;i<=b;i++)
		{
			if (squaresum(i)==i)
			{
				System.out.println(i+" is a neon number");
			}
		}
	}
	public static int squaresum(int x)
	{
		int m = x*x;
		int y = m;
		int n = 0;
		int b = 0;
		while(y>0)
		{
			b=y%10;
			n+=b;
			y=y/10;
		}
		return n;
	}
}
