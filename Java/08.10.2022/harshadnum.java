import java.util.*;
class harshadnum //num divisible by sum of it own 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int a = s.nextInt();
		int b = a;
		int sum = 0;
		int x = 0;
		while (b>0)
		{
			x=b%10;
			sum+=x;
			b=b/10;
		}
//		System.out.println(sum);
		if (a%sum==0)
		{
			System.out.println("It is harshadnum");
		}
	}
}
