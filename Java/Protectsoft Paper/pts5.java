import java.util.*;
class pts5
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int [] a = s.nextInt();//{5,2,6,4,1,3};
		for (int i = 0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				a[i]=0;
			}
		}
		for (int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
