import java.util.*;
class harshadnos //num divisible by sum of it own 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the end number");
		int a = s.nextInt();
		for (int i = 1;i<=a;i++)
		{
			int b = i;
			int sum = 0;
			int x = 0;
			while (b>0)
			{
				x=b%10;
				sum+=x;
				b=b/10;
			}
			if (i%sum==0)
			{
				System.out.println(i+" is a harshadnum");
			}
		}
	}
}
