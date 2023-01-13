import java.util.*;
class wt3
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter input to check");
		String a = s.nextLine();
		StringBuffer b = new StringBuffer(a);
		if (a.contentEquals(b.reverse()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}
