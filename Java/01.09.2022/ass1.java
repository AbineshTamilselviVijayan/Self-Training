import java.util.*;
class ass1 
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args)
	{
		//int x = 10;
		//int y = 20;
        System.out.println("Enter first value");
		int x = s.nextInt();
		System.out.println("Enter second value");
		int y = s.nextInt();
		System.out.println("Addition : "+add(x,y));
		System.out.println("Subraction : "+sub(x,y));
		System.out.println("Multiplication : "+sta(x,y));
		System.out.println("Division : "+div(x,y));
		System.out.println("Modulas : "+mod(x,y));
	}
			public static int add(int a, int b)
			{
				return a+b;
			}
			public static int sub(int a, int b)
			{
				return a-b;
			}
			public static int sta(int a, int b)
			{
				return a*b;
			}
			public static int div(int a, int b)
			{
				return a/b;
			}
			public static int mod(int a, int b)
			{
				return a%b;
			}
}