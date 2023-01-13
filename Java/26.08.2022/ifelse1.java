import java.util.*;
class ifelse1 
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter an integer between -50 to 50");
		int res = s.nextInt();
		if (res>0)
		{
			if ((res>=1)&&(res<=50))
			{
				System.out.println("Java");
			}
			else
			{
				System.out.println("Manual");
			}
		}
		else if (res<0)
		{
			if ((res<=-50)&&(res>=-1))
			{
				System.out.println("SQL");
			}
			else
			{
				System.out.println("My SQL");
			}
		}
		else
		{
			System.out.println("Error the number is not in range !");
		}
	}
}
