import java.util.*;
class pts1 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
//		System.out.println("Type the sentence below");
		String a = "Hi John Hi Bob john and Bob are brothers";//s.nextLine();
		String [] b = a.split(" ");
		int n = 1;
		for (int i = 0;i<b.length-1;i++)
		{
			n = 1;
			for (int j = i+1;j<b.length;j++)
			{
				if (((b[i]).equals(b[j]))&&(!((b[i]).equals(""))))
				{
					n++;
					b[j] = "";
				}
			}
			if (!((b[i]).equals("")))
			{
				System.out.println(b[i]+"-"+n);
			}
		}
	}
}
