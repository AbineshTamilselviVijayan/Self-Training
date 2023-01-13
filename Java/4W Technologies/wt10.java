import java.util.*;
class wt10
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int a = s.nextInt();
		int b = 0;
		int temp = 0;
		int sum = 0;
		while (a>0)
		{
			temp = a%10;
			b = (b*10)+temp;
			a=a/10;
		}
		while (b>0)
		{
			temp = b%10;
			sum = (sum*100)+(temp*10);
			b=b/10;
		}
		System.out.println(sum);
	}
}
