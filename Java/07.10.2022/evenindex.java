import java.util.*;
class evenindex 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int [] a = {20,81,90,16};
		for (int i = 0;i<a.length;i++)
		{
			if (i%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
