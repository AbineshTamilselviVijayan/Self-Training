import java.util.*;
class leftrotarr
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of times to left rotate the array");
		int n = s.nextInt();
		int [] a = {1,2,3,4,5};
		int temp = 0;
		for (int i = 1;i<=n;i++)
		{
			temp = a[0];
			for (int j = 0;j<a.length-1;j++)
			{
				a[j] = a[j+1];
			}
			a[a.length-1] = temp;
		}
		for (int k = 0;k<a.length;k++)
		{
			System.out.print(a[k]+", ");
		}
	}
}
