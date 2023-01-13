import java.util.*;
class ai11
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter 'N' value");
		int count = s.nextInt();
		int a = 2;
		int b = 4;
		System.out.print(a*a+", ");
		for (int i = 0;i<count-1;i++)
		{
			int c = a*b;
			int d = c-1;
			System.out.print(d+", ");
			b = c;
		}
	}
}
