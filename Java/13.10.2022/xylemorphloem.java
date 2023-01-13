import java.util.*;
class xylemorphloem
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to validate");
		int a = s.nextInt();
		if (a<100)
		{
			System.out.println("Verify the input");
		}
		else if (ed(a)==md(a))
		{
			System.out.println("The number is xylem");
		}
		else
		{
			System.out.println("The number is phloem");
		}
	}
	public static int ed(int x)
	{
		int k = x;
		int h = x;
		int first = 0;
		int last = 0;
		int count = 0;
		while (k>0)
		{
			count++;
			k=k/10;
		}
		last = h%10;
		for (int i = 1;i<count;i++)
		{
			h=h/10;
		}
		first = h;
		int sum1 = last+first;
		return sum1;
	}
	public static int md(int y)
	{
		int q = y;
		int w = 0;
		int sum2 = 0;
		int sum = 0;
		while (q>0)
		{
			w = q%10;
			sum+=w;
			q=q/10;
		}
		sum2 = (sum-ed(y));
		return sum2;
	}
}