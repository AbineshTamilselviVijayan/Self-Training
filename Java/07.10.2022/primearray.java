import java.util.*;
class primearray 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int [] a = {10,20,2,7,5};
		for (int i = 0;i<a.length;i++)
		{
			int n = 0;
			for (int j = 1;j<=a[i];j++)
			{
				if (a[i]%j==0)
				{
					n++;
				}
			}
//			System.out.println(n);
			if (n==2)
			{
				System.out.println(a[i]+" is a prime number");
			}
			else
			{
				System.out.println(a[i]+" is not a prime number");
			}
		}
	}
}
