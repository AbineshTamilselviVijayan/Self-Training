import java.util.*;
class oddoreven
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the number to decide : ");
		int res = s.nextInt();
		if ((res%2)==0)
		{
			System.out.println("The number entered is "+res+" is even");
		}
		else
		{
			System.out.println("The number entered is "+res+" is odd");
		}
	}
}
