import java.util.*;
class rightrotarr
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of times to right rotate the array");
		int n = s.nextInt();
		int [] a = {1,2,3,4,5};
		int x = 0;
		int y = 0;
		for (int j = 0;j<n;j++)
		{
			x = a[a.length-1];
			for (int i = a.length-1;i>0;i--)
			{
				a[i]=a[i-1];
			}
			a[0]=x;
		}
		for (int k = 0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
}
