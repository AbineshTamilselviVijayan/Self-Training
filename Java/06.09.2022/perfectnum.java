import java.util.*;
class perfectnum
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the ending range");
		int x = s.nextInt();
		for (int a=1;a<=x;a++)
		{
			int n = 0;
			for (int i=1;i<=a;i++)
			{
				if (a%i==0)
				{
					n+=i;
					if ((n-a)==a)
					{
						System.out.println(a);
					}
				}
			}
		}	
	}
}
