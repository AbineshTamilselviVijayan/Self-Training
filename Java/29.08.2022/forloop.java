import java.util.*;
class forloop
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter the starting character to displayed");
		char a = s.next().charAt(0);
		System.out.println("Enter the ending character upto to be displayed");
		char b = s.next().charAt(0);
		for (char i = a;i<=b;i++)
		{
			System.out.print(i+" "+"->"+" ");
			int x = 1;
			do
			{
				System.out.print(x+" ");
				x++;
			}
			while (x<=10);
			System.out.println();
		}
	}
}
