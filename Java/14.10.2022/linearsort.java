import java.util.*;
class linearsort
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int [] a = {15,59,48,26,75,53,42,86};
		System.out.println("Enter a number");
		int b = s.nextInt();
		for (int i = 0;i<a.length;i++)
		{
			if (a[i]==b)
			{
				System.out.println("The number is present");
				break;
			}
		}
	}
}
