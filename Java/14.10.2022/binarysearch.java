import java.util.*;
class binarysort 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int b = s.nextInt();
		int temp = 0;
		int [] a = {15,59,48,26,75,53,42,86};
		int x = 0;
		int y = a.length-1;
		for (int i = 0;i<a.length-1;i++)
		{
			for (int j = i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		//binarysorting
		int z = 0;
		while (y>=x)
		{
			z = (x+y)/2;
			if (b==a[z])
			{
				System.out.println("The number is present");
				break;	
			}
			else if (b<a[z])
			{
				y = z-1;
			}
			else if (b>a[z])
			{
				x = z+1;
			}
		}
	}
}
