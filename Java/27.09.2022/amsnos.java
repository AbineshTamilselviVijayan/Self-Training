import java.util.*;
class amsnos
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a starting limit number");
		int a = s.nextInt();
		System.out.println("Enter a ending limit number");
		int b = s.nextInt();
		for (int i = a;i<=b;i++)
		{
			int x = i;
			int y = i;
			int z = 0;
			int c = 1;
			int count = 0;
			int sum = 0;
			while (x>0)
			{
				count++;
				x=x/10;
			}
			while (y>0)
			{
				c = 1;
				z = y%10;
				for (int j = 1;j<=count;j++)
				{
					c*=z;
				}
				y=y/10;
				sum+=c;
			}
			if (sum==i)
			{
				System.out.println(i+" is an amstrong number");
			}
		}
	}
}
