//CREATE A METHOD FOR CHECKING GIVEN NUMBER IS PRIME OR NOT
import java.util.*;
class t6
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int x = s.nextInt();
		porc(x);
	}
	public static int porc(int y)
	{
		int n = 0;
		for (int i = 1;i<=y;i++)
		{
			if (y%i==0)
			{
				n++;
			}
		}
		if (y==0 || y==1)
		{
			System.out.println("The entered number is neither prime nor composite");
		}
		else if (n==2)
		{
			System.out.println("The entered number is PRIME");
		}
		else
		{
			System.out.println("The entered number is COMPOSITE");
		}
		return n;
	}
}

