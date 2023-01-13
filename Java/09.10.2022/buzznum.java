import java.util.*;
class buzznum 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check");
		int a = s.nextInt();
		if (lastseven(a) || divideseven(a))
		{
			System.out.println("It is a buzz number");
		}
		else
		{
			System.out.println("It is not a buzz number");
		}
	}
	public static boolean lastseven(int x)
	{
		boolean m;
		if (x%10==7)
		{
			m = true;
		}
		else
		{
			m = false;
		}
		return m;
	}
	public static boolean divideseven(int y)
	{
		boolean n;
		if (y%7==0)
		{
			n = true;
		}
		else
		{
			n = false;
		}
		return n;
	}
}
