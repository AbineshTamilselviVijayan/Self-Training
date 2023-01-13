import java.util.*;
class ai2//replace remove
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("String");
		String a = s.nextLine();
		System.out.println("Enter the string to remove");
		String b = s.nextLine();
		System.out.println("Enter the character to replace");
		String c = s.nextLine();
		System.out.println("Enter the character to replace with");
		String d = s.nextLine();
		String [] e = a.split("");
		for (int i = 0;i<e.length;i++)
		{
			if ((e[i]).equals(b))
			{
				e[i] = "0";
			}
		}
		for (int j = 0;j<e.length;j++)
		{
			if ((e[j]).equals(c))
			{
				e[j] = d;
			}
		}
		for (int k = 0;k<e.length;k++)
		{
			if (!((e[k]).equals("0")))
			{
				System.out.print(e[k]);
			}
		}
	}
}
