import java.util.*;
class amsarray 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int [] a = {20,81,90,16,153};
		for (int i = 0;i<a.length;i++)
		{
			int n = 0;
			int b = a[i];
			while (b>0)
			{
				n++;
				b=b/10;
			}
//			System.out.println(n);
			int y = 0;
			int m = 0;
			int c = a[i];
			while (c>0)
			{
				int x = 1;
				y=c%10;
				for (int j = 1;j<=n;j++)
				{
					x*=y;
				}
//				System.out.println(x);
				c=c/10;
				m+=x;
//				System.out.println(m);
			}
//			System.out.println(m);
//			System.out.println(a[i]);
			if (m==a[i])
			{
				System.out.println(a[i]+" is a asmtrong");
			}
		}
	}
}
