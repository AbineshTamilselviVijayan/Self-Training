import java.util.*;
class s14
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to print matrix");
		int n = s.nextInt();
		int a = (n%2!=0)?n:(n+1);
		int x = 0;
		System.out.println("The matrix below is "+a);
		for (int i = 0;i<a;i++)
		{
			for (int j = 0;j<a;j++)
				{
					if (j>=i)
						{
						int y = x%2;
						System.out.print(" "+y);
						x++;
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
