import java.util.*;
class aicq
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter vallue for n");
		int n = s.nextInt();
		System.out.println("Enter vallue for N");
		int N = s.nextInt();
		for (int i = 0;i<=N;i+=2)
		{
			int j = i+1;
			int k = j+1;
			System.out.print((n+i)+"/"+(n-j)+" + "+(n+j)+"/"+(n-k)+" - ");
		}
	}
}
