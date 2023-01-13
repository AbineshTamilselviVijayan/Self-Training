import java.util.*;
class leo
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args)
	{
		int[] a = new int[7];
		for(int i = 0;i<a.length;i++)
		{
		a[i] = s.nextInt();
		}
		for(int i = 0;i<a.length;i++)
		{
		System.out.println(a[i]*a[i]);
		}		
	}	
}