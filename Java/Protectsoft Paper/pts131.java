import java.util.*;
class pts131 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the n value");
		int n = s.nextInt();
		for (int i = 1;i<=n;i++)
		{
			for (int j = 1;j<=n;j++)
			{
				if (i+j>n)
				{
					System.out.print(i+" ");
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
