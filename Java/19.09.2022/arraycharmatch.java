import java.util.*;
class arraycharmatch
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a letter");
		char ch = s.next().charAt(0);
		int m = 0;
		char[] a = {'a','p','p','l','e'};
		for (int i = 0;i<a.length;i++)
		{
			if (a[i]==ch)
			{
				m = 1;
			}
		}
		if (m==1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
}
