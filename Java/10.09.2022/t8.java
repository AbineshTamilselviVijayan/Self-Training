//CREATE A METHOD WHICH WILL FIND THE COUNT OF THE EVEN FACTORS OF THE GIVEN NUMBER
import java.util.*;
class t8
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int x = s.nextInt();
		evenfact(x);
	}
	public static int evenfact(int y)
	{
		int n = 0;
		for (int i=1;i<=y;i++)
		{
			if (y%i==0)
			{
				if (i%2==0)
				{
					n++;
				}
			}
		}
		System.out.print("The count of even factor : "+n);
		return n;
	}
}
