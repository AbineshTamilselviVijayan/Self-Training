import java.util.*;
class porn 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter an integer");
		int res = s.nextInt();
		if (res>0)
		{
			System.out.println("The entered integer "+res+" is positive");
		}
		else if (res<0)
		{
			System.out.println("The entered integer "+res+" is negative");
		}
		else
		{
			System.out.println("Please enter a valid integer as input-");
		}
	}
}
