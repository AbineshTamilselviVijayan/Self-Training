import java.util.*;
class arrayweb 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the values");
		for (int i = 0;i<a.length ;i++ )
		{
			a[i] = s.nextInt();
		}
		for (int i = 0;i<a.length ;i++ )
		{
			System.out.print(a[i]+",");
		}
	}
}
