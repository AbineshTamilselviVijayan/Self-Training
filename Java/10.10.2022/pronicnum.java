import java.util.*;
class pronicnum
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to verify");
		int a = s.nextInt();
		int x = 1;
		int y = 2;
		for (int i = 0;i<=a;i++)
		{
			if (((x+i)*(y+i))==a)
			{
				System.out.println("The number is pronic");
				break;
			}
		}
	}
}
