import java.util.*;
class arrass
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int [] a = {88,41,48,88,96,4,135,135,121,121};
		for (int i = 0;i<a.length;i++)
		{
			for (int j = i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
				System.out.println("The second occurance number is : "+a[j]);
				System.out.println();
				isprime(a[j]);
				System.out.println();
				ispalindrome(a[j]);
				System.out.println();
				isxylem(a[j]);
				System.out.println();
				isamstrong(a[j]);
				System.out.println();
				System.out.println("The remaining number of digits are : "+(a.length-j-1));
				}
			}
		}
	}
	public static void isprime(int m)
	{
		int n = 0;
		for (int q = 1;q<=m;q++)
		{
			if (m%q==0)
			{
				n++;
			}
		}
		if (n==2)
		{
			System.out.println("The number "+m+" is prime");
		}
		else
		{
			System.out.println("The number "+m+" is not a prime");
		}
	}
	public static void ispalindrome(int f)
	{
		int v = f;
		int temp = 0;
		int n = 0;
		while (v>0)
		{
			temp=v%10;
			n=(10*n)+temp;
			v=v/10;
		}
		if (n==f)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}
	public static void isamstrong(int g)
	{
		int a = g;
		int y = a;
	    int x = 0;
		int m = 0;
	    while (y>0)
		{
	      x=y%10;
		  m+=(x*x*x);
	      y=y/10;
	    }
	    if (m==a)
		{
	      System.out.println(a+" is a amstrong number");
	    }
	    else
		{
	      System.out.println(a+" not a amstrong number");
		}
	}
	public static void isxylem(int n)
	{
		int q = n;
		int w = n;
		int last = q%10;
		while (q>9)
		{
			q=q/10;
		}
		int first = q;
		int sum1 = last+first;
		int c = 0;
		int sum = 0;
		while (w>0)
		{
			c = w%10;
			sum+=c;
			w=w/10;
		}
		int md = sum - sum1;
		if (md==sum1)
		{
			System.out.println(n+" is xylem");
		}
		else
		{
			System.out.println(n+" is not xylem");
		}
	}
}