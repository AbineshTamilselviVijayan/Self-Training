import java.util.*;
class ifelse2 
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter an integer between -50 to 50");
		int res = s.nextInt();
		if ((res>0)&&(res<=50))
		{
			System.out.println("Java");
		}
		else if ((res<=-1)&&(res>=-50))
		{
			System.out.println("Manual");
		}
		else
		{
			System.out.println("Error the number is not in range !");
		}
	}
}
