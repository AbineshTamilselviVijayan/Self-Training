import java.util.*;
class arrayintmatch
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter an integer");
		int m = 0;
		int n = s.nextInt();
		int[] a = {1,2,3,4,5,6,7,8,9,0};
		for (int i = 0;i<a.length;i++)
		{
			if (a[i]==n)
			{
				m = 1;
			}
		}
		if (m==1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
}
