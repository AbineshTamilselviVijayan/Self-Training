import java.util.*;
class ai42
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter number");
		String a = "123422316790";//s.nextInt();
		String [] b = a.split("");
		String [] c = new String[b.length];
		int count = 1;
		for (int i = 0;i<b.length;i++)
		{
			count = 1;
			for (int j = i+1;j<b.length;j++)
			{
				if (((b[i]).equals(b[j]))&&(!((b[i]).equals(""))))
				{
					count++;
					b[j]="";
				}
			}
			if (!((b[i]).equals("")))
			{
				System.out.print(b[i]+"="+count+", ");
			}
		}
	}
}
