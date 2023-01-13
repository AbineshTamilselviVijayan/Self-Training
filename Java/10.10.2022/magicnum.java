import java.util.*;//1+4+3+2 = 10 = 1+0 = 1;
class magicnum 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check");
		int a = s.nextInt();
		int b = a;
		int sum = 0;
		int x = 0;
		while (b>9)
		{
			sum=0;
			while (b>0)
			{
			x=b%10;
			sum+=x;
			b=b/10;
			}
			b=sum;
		}
		if (sum==1)
		{
			System.out.println(a+" is a magic number");
		}
		else
		{
			System.out.println(a+" is not a magic number");
		}
	}
}
