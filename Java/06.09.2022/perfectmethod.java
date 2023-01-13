import java.util.*;
class perfectmethod
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int a = s.nextInt();
		fact(a);
		if (fact(a)==a)
		{
			System.out.println("The entered number is perfect number");
		}
		else
		{
			System.out.println("The entered number is not a perfect number");
		}
	}
	public static int fact(int x)
	{
		int n = 0;
		for (int i = 1;i<=x;i++)
		{
			if (x%i==0)
			{
				n+=i;
			}
		}
		int m=n-x;
//		System.out.println(m);
		return m;
	}
}
