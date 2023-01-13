import java.util.*;
class replace
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String a = "Java";
		System.out.println("Enter the character to replace");
		char c = s.next().charAt(0);
		System.out.println("Enter the character to replace with");
		char d = s.next().charAt(0);
		char [] b = a.toCharArray();
		for (int i = 0;i<a.length();i++)
		{
			if (c==b[i])
			{
				b[i]=d;
			}
		}
		for (int j = 0;j<b.length;j++)
		{
			System.out.print(b[j]);
		}
	}
}
