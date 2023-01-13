//CREATE A METHOD WHICH WILL ACCEPT ONE INTEGER PARAMETER AND PRINT ITS FACTORS
import java.util.*;
class t7
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int x = s.nextInt();
		fact(x);
	}
	public static int fact(int y)
	{
		System.out.println("The factors of the number "+y+" are");
		for (int i=1;i<=y;i++)
		{
			if (y%i==0)
			{
				System.out.println(i);
			}
		}
		return y;
	}
}
