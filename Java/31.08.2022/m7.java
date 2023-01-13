import java.util.*;
class  m7
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter a number to create a square matrix");
		int x = s.nextInt();
		System.out.println("Enter the starting number");
		int z = s.nextInt();
		int n = (x%2!=0)?x:x+1;
//		int n = x;
		System.out.println("Matrix of "+n+" is to be created");
		for (int i = 0;i<n;i++)
		{
			for (int j = 0;j<n;j++)
			{
				if (i%2!=0)
				{
					System.out.print(" "+z);
				}
				else if (i==(n/2))
				{
					System.out.print(" "+(z-2));
				}
				else
				{
					System.out.print(" "+(z-1));
				}
			}	
			System.out.println();
		}
	}
}