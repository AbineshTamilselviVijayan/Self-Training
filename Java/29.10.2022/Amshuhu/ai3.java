import java.util.*;
class ai3//array
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of the array");
		int n = s.nextInt();
		int [] a = new int[n];
		for (int i = 0;i<a.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" value");
			a[i] = s.nextInt();
		}
		int sum = 0;
		int mid = a[a.length/2];
		int min = a[0];
		int max = a[0];
		for (int j = 0;j<a.length;j++)
		{
			sum+=a[j];
		}
		int avg = sum/a.length;
		for (int k = 0;k<a.length;k++)
		{
			if (min>a[k])
			{
				min = a[k];
			}
			else if (max<a[k])
			{
				max = a[k];
			}
		}
		System.out.println("Smallest : "+min);
		System.out.println("Largest : "+max);
		System.out.println("Sum : "+sum);
		System.out.println("Average : "+avg);
		System.out.println("Middle Value : "+mid);
	}
}
