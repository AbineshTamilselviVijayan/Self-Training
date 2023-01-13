import java.util.*;
class arraymax 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		int max = 0;
		for (int i = 0;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
