import java.util.*;
class tr
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args)
	{
		int n = 0;
		char[] a = new char[5];
		System.out.println("Enter letters to store");
		for(int i = 0;i<a.length;i++)
		{
			a[i] = s.next().charAt(0);
		}
		System.out.println("Enter a letter");
		char x = s.next().charAt(0);
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				n++;
			}
		}
		System.out.println(n);
	}
}