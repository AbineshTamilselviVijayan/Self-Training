import java.util.*;
class s41
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
			int x = 1;
			int y = 0;
			for (int j = 0;j<a;j++)
				{
					if (i==a-1)
					{
						System.out.print(" "+y);
						y++;
					}
					else if (i+j>=n-1)
					{	
						System.out.print(" "+x);
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
// success
//rev number