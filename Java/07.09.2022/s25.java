import java.util.*;
class s25
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to print matrix");
		int n = s.nextInt();
		int a = (n%2!=0)?n:(n+1);
		System.out.println("The matrix below is "+a);
		for (int i = 0;i<a;i++)
		{
			for (int j = 0;j<a;j++)
				{
					if (i >= j+(a/2))
						{
						System.out.print(" *");
						}
						else
						{
						System.out.print("  ");
						}
				}
				System.out.println(" ");
		}
	}
}
