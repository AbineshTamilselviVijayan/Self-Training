import java.util.*;
class nthlargestofn
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		System.out.println("Enter the largest position of values to print");
		int k = s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the values");
		for (int i = 0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		int max = 0;
		for (int i = 0;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max = a[i]	;
			}
		}
		System.out.println("largest number is : "+max);
		int min = max;
		for (int i = 0;i<a.length;i++)
		{
			if (a[i]<min)
			{
				min = a[i]	;
			}
		}
		System.out.println("Smallest number is : "+min);
		int y = 0;
		for (int z = max;z>=min;z--)
		{
			for (int j = 0;j<a.length;j++)
			{
				if (z==a[j])
				{
					y++;
					if (y==k)
					{
						System.out.println("The "+k+" largest of given number is : "+a[j]);
					}
				}
			}
		}
	}
}
