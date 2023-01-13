//WAJP TO PRINT PASCAL TRIANGLE (1)
import java.util.*;
class t10
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the n value to create n*n matrix");
		int n = s.nextInt();
		int x = (n%2==0)?n+1:n;
		for (int i = 0;i<x;i++)
		{
			for (int j = 0;j<x;j++)
			{
				if ((i>=j)&&(i+j>=x-1))
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
