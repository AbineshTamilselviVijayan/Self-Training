import java.util.*;
class factorial
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number for factorial");
		int a = s.nextInt();
		int b = a;
		int m = 1;
		for (int i = 1;i<=a;i++,b--)
		{
			m*=b;
		}
		System.out.println(m);
	}
}
