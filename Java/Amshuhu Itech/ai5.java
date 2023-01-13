import java.util.*;
class ai5
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a value");
		int n = s.nextInt();
		for (int i = 0;i<((n*2)-1);i++)
		{
			for (int j = 0;j<((n*2)-1);j++)
			{
				if ((i>=j)&&(i+j>=8))
				{
					System.out.print("* ");
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
