import java.util.*;
class ai31
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter a value");
		int a = s.nextInt();
		int b = a,c = a;
		int d = 0;
		int h = 1;
		int n = 0;
		int sum = 0;
		while (c>0)
		{
			n++;
			d = c%10;
			for (int i = 1;i<n;i++)
			{
				h*=8;
			}
			sum+=(h*d);
			c=c/10;
		}
		System.out.println(sum);
	}
}
