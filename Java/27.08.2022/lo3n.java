import java.util.*;
class lo3n
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter number 1st : ");
		int x = s.nextInt();
		System.out.println("Enter number 2nd : ");
		int y = s.nextInt();
		System.out.println("Enter number 3rd : ");
		int z = s.nextInt();
		if ((x>y)&&(x>z))
		{
			System.out.println("The largest of three numbers is : "+x);
		}
		else if ((y>x)&&(y>z))
		{
			System.out.println("The largest of three numbers is : "+y);
		}
		else if ((z>x)&&(z>y))
		{
			System.out.println("The largest of three numbers is : "+z);
		}
		else
		{
			System.out.println("Please verify the given input numbers");	
		}
	}
}
