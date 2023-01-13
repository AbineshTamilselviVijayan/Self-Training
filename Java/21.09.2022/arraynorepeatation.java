import java.util.*;
class arraynorepeatation
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = 0;
		int x = s.nextInt();
		int[] a = {10,30,20,30,20};
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				n++;
			}
		}
		if (n==0)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println(n);
		}
	}
}