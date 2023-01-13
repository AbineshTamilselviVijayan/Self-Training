import java.util.*;
class specialnos 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the staring range");
		int a = s.nextInt();
		System.out.println("Enter the ending range");
		int b = s.nextInt();
		for (int z = a;z<=b;z++)
		{
			if (z==sum(z))
			{
				System.out.println(z+" is a special number");
			}
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
