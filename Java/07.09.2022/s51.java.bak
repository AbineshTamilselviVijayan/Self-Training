import java.util.*;
class s51
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
			for (int j = 0;j<a;j++)
				{
					if ((i+j>=n-1) && (i>=j))
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
// 1 to n in down arrow