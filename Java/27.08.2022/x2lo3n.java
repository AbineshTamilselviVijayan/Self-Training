import java.util.*;
class x2lo3n
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter 1st no");
		int x = s.nextInt();
		System.out.println("Enter 2snd no");
		int y = s.nextInt();
		System.out.println("Enter 3rd no");
		int z = s.nextInt();
		if (((x>y)&&(x>z))&&(y>z))
		{
			System.out.println("The number "+y+" is the second largest of three numbers");
		}
		else if (((x>y)&&(x>z))&&(z>y))
		{
			System.out.println("The number "+z+" is the second largest of three numbers");
		}
		else if (((y>x)&&(y>z))&&(x>z))
		{
			System.out.println("The number "+x+" is the second largest of three numbers");
		}
		else if (((y>x)&&(y>z))&&(z>x))
		{
			System.out.println("The number "+z+" is the second largest of three numbers");
		}
		else if (((z>x)&&(z>y))&&(x>y))
		{
			System.out.println("The number "+x+" is the second largest of three numbers");
		}
		else if (((z>x)&&(z>y))&&(y>x))
		{
			System.out.println("The number "+y+" is the second largest of three numbers");
		}
		else
		{
			System.out.println("Check the given input");
		}
	}
}
