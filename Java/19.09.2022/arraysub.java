import java.util.*;
class arraysub
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int m = 0;
		int[] a = new int[n];
		System.out.println("Enter the values");
		for (int i = 0;i<a.length ;i++ )
		{
			a[i] = s.nextInt();
		}
		for (int i = 0;i<a.length ;i++ )
		{
			m = a[0]-a[a.length-1];
		}
		System.out.print("Difference of 1st and last array : "+m);
	}
}
