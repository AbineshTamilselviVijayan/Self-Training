//WAJP TO FIND SECOND LARGEST NUMBER USING DECISION MAKING STATEMENT
import java.util.*;
class t3
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the first number");
		int b = s.nextInt();
		System.out.println("Enter the first number");
		int c = s.nextInt();
		if ((a>b)&&(a>c))
		{
			if (b>c)
			{
				System.out.println("The second largest number is : "+b);
			}
			else
			{
				System.out.println("The second largest number is : "+c);
			}
		}
		else if ((b>a)&&(b>c))
		{
			if (a>c)
			{
				System.out.println("The second largest number is : "+a);
			}
			else
			{
				System.out.println("The second largest number is : "+c);
			}
		}
		else if ((c>a)&&(c>b))
		{
			if (a>b)
			{
				System.out.println("The second largest number is : "+a);
			}
			else
			{
				System.out.println("The second largest number is : "+b);
			}
		}
		else
		{
			System.out.println("Input error");
		}
	}
}
