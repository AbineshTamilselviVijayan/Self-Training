import java.util.*;
class stringtochar
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n = 0;
		System.out.println("Enter a word");
		String city = s.next();
		char[] a = city.toCharArray();
		System.out.println("Enter a letter");
		char x = s.next().charAt(0);
		for (int i = 0;i<a.length;i++)
		{
			if (a[i]==x)
			{
				n++;
			}
		}
		System.out.println(n);
	}
}
