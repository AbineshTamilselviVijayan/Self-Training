import java.util.*;
class palinum
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check for ASMNO");
		int a = s.nextInt();
		int y = a;
		int c = 0;
		int m = 0;
		while (y>0)
		{
			c = y%10;
			m = (10*m)+c;
			y=y/10;
		}
		if (m==a)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}
}
