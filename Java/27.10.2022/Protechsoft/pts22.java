import java.util.*;
class pts22
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a value");
		int a = s.nextInt();
		for (int i = a;i>0;i--)
		{
			for (int j = a;j>0;j--)
			{
				if (i>=j)
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
