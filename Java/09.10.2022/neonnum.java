import java.util.*;
class neonnum 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int a = s.nextInt();
		if (squaresum(a)==a)
		{
			System.out.println("The number is neon");
		}
		else
		{
			System.out.println("It is not a neon number");
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
