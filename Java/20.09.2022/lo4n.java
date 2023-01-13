import java.util.*;
class lo4n 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter num - 1");
		int a = s.nextInt();
		System.out.println("Enter num - 2");
		int b = s.nextInt();
		System.out.println("Enter num - 3");
		int c = s.nextInt();
		System.out.println("Enter num - 4");
		int d = s.nextInt();
		if ((a>b)&&(a>c)&&(a>d))
		{
			System.out.println("The largest of 4 number is : "+a);
		}
		else if ((b>a)&&(b>c)&&(b>d))
		{
			System.out.println("The largest of 4 number is : "+b);
		}
		else if ((c>a)&&(c>b)&&(c>d))
		{
			System.out.println("The largest of 4 number is : "+c);
		}
		else if ((d>a)&&(d>b)&&(d>c))
		{
			System.out.println("The largest of 4 number is : "+d);
		}
		else
		{
			System.out.println("Check the input");
		}
	}
}
