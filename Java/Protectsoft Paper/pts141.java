import java.util.*;
class pts141 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter date");
		String x = s.nextLine();
		try
		{
			String [] z = x.split("/");
			int d = Integer.parseInt(z[0]);
			int m = Integer.parseInt(z[1]);
			int y = Integer.parseInt(z[2]);
			if ((m==2)&&(y%4==0)&&(d<30)&&(d>0))
			{
				System.out.println("Valid date");
			}
			else if ((m==2)&&(y%4!=0)&&(d>0)&&(d<29))
			{
				System.out.println("Valid date");
			}
			else if ((m<13)&&(m>0)&&(m!=2)&&(d<32)&(d>0))
			{
				System.out.println("Valid date");
			}
			else
			{
				System.out.println("Invalid date");
			}
		}
		catch (Exception e)
		{
			System.out.println("Invalid date");
		}
	}
}
