import java.util.*;
class forloop1
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter the starting digit to be displayed after the arrow");
		int x = s.nextInt();
		System.out.println("Enter the ending digit upto to be displayed after the arrow");
		int y = s.nextInt();
		System.out.println("Enter the starting character to displayed");
		char a = s.next().charAt(0);
		System.out.println("Enter the ending character upto to be displayed");
		char b = s.next().charAt(0);
		for (char i = a;i<=b;i++)
		{
			System.out.print(i+" "+"->"+" ");
			for (int j = x;j<=y;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
