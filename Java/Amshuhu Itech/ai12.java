import java.util.*;
class ai12
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a = 3;
		int b = 2;
		System.out.println("Enter 'N' value");
		int count = s.nextInt();
		System.out.print((b*b-1)+", ");
		for (int i = 0;i<=count-2;i++)
		{
			int c= a*b;
			int d = c-1;
			System.out.print(d+", ");
			a = c;
		}
	}
}
