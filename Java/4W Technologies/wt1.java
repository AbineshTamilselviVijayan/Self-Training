import java.util.*;//binary or not
class wt1
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the input");
		int num = s.nextInt();
		int temp = 0;
		int count = 0;
		while (num>0)
		{
			temp = num%10;
			if ((temp!=0)&&(temp!=1))
			{
				count++;
			}
			else
			{
			}
			num = num/10;
		}
		if (count>0)
		{
			System.out.println("Input is not a binary number");
		}
		else
		{
			System.out.println("Input is a binary number");
		}
	}
}
