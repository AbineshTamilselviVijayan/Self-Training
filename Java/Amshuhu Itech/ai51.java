import java.util.*;
class ai51
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter value");
		int a = s.nextInt();
		char ch = 'A';
		for (int i = 0;i<a;i++)
		{
			for (int j = 0;j<a;j++)
			{
				if (i>=j)
				{
					System.out.print(ch+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			ch++;
			System.out.println();
		}
	}
}
