import java.util.*;
class fibonacci
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		System.out.println("Enter the series");
		int c = s.nextInt();
		int d = 0;
		System.out.print(a+", "+b+", ");
		for (int i = 2;i<=c;i++)
		{
			d = a+b;
			System.out.print(d+", ");
			a=b;
			b=d;
		}
	}
}
