import java.util.*;
class  m4
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter a number to create a square matrix");
		int x = s.nextInt();
		int n = (x%2!=0)?x:x+1;
		System.out.println("Matrix of "+n+" is to be created");
		for (int i = 0;i<n;i++)
		{
			for (int j = 0;j<n;j++)
			{
				Thread.sleep(50);
				if (i==0 || j==0 || i==n/2 || j==n/2 || i==n-1 || j==n-1)
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
