//CREATE A METHOD WHICH CAN ACCEPT INTEGER AND FIND THE SUM OF THE FACTORS
import java.util.*;
class t9
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int x = s.nextInt();
		sumfact(x);
	}
	public static int sumfact(int y)
	{
		int n = 0;
		for (int i=1;i<=y;i++)
		{
			if (y%i==0)
			{
				n+=i;
			}
		}
		System.out.print("The sum of factors : "+n);
		return n;
	}
}
