import java.util.*;
class wt2//string nos
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a string to check");
		String a = s.nextLine();
		char [] b = a.toCharArray();
		int count = 0;
		for (int i = 0;i<b.length;i++)
		{
			if ((b[i]=='0')||(b[i]=='9')||(b[i]=='1')||(b[i]=='2')||(b[i]=='3')||(b[i]=='4')||(b[i]=='5')||(b[i]=='6')||(b[i]=='7')||(b[i]=='8'))
			{
			}
			else
			{
				count++;
			}
		}
		if (count==0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
