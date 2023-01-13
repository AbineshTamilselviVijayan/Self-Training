import java.util.*;
class ai103
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a = s.nextInt();
		int b = a;
		int count = 3;
		for (int i = 0,j = 0;j<count;i+=b)
		{
			System.out.print(a+i);
			j++;
		}
	}
}
