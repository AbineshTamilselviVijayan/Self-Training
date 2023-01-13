import java.util.*;
class arrayrev 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of the array");
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0;i<a.length;i++)
		{
			System.out.println("Enter the "+i+" values");
			a[i] = s.nextInt();
		}
		System.out.println("The reverse order of array is");
		for (int i = a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
