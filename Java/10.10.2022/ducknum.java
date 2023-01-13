import java.util.*;
class ducknum
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to verify");
		int a = s.nextInt();
		int b = a,c = a;
		int d = a;
		int x = 0;
		int count = 0;
		while (b>0)
		{
			count++;
			b=b/10;
		}
//		System.out.println(count);
		for (int n = 1;n<count-1;n++)
		{
			while (c>9)
			{
				c=c/10;
			}
		}
//		System.out.println(c);
		if (c==0)
		{
			System.out.println(a+" is not a duck number");
		}
		else if (match(a))
		{
			System.out.println(a+" is a duck number");
		}
		else
		{
			System.out.println(a+" is not a duck number");
		}
	}
	public static boolean match(int d)
	{
		boolean o = false;
		int x = 0;
		while (d>0)
		{
			x = d%10;
			d=d/10;
			if (x==0)
			{
				o = true;
			}
		}
		return o;
	}
}