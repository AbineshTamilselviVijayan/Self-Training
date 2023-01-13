import java.util.*;
class dateformat 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter date in format of DD/MM/YYYY");
		String x = s.nextLine();
		String [] z = x.split("/");
		int d = Integer.parseInt(z[0]);
		int m = Integer.parseInt(z[1]);
		int y = Integer.parseInt(z[2]);
		if ((d>0)&&(d<30)&&(y%4==0)&&(m==2))
		{
			System.out.println("Valid date");
		}
		else if ((d>0)&&(d<29)&&(m==2)&&(y%4!=0))
		{
			System.out.println("Valid date");
		}
		else if ((d>0)&&(d<32)&&(m>0)&&(m!=2)&&(m<12)&&(y%4!=0))
		{
			System.out.println("Valid date");
		}
		else
		{
			System.out.println("Invalid date");
		}
	}
}
