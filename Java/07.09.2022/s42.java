import java.util.*;
class s42
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to print matrix");
		int n = s.nextInt();
		int a = (n%2!=0)?n:(n+1);
		char x = 65;
		System.out.println("The matrix below is "+a);
		for (int i = 0;i<a;i++)
		{
			for (int j = 0;j<a;j++)
				{
					if (i+j <= n-1)
						{
						if (i%2==0)
							{
							int y = x+j;
							System.out.print(" "+(char)y);
							}
							else if (i%2!=0)
							{
								System.out.print(" "+(j+1));
							}
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
//a1b2c3
