import java.util.*;
class ai201
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter an integer");
		int a = s.nextInt();
		System.out.println(fact(a));
	}
	public static int fact(int b)
	{
		int c = b;
		int m = 1;
		while (c>0)
		{
			m*=c;
			c--;
		}
		return m;
	}
}
