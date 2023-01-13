//WAJP TO CHECK WHETHER GIVEN NUMBER IS EVEN OR ODD BY USING CONDITIONAL OPERATOR? 
import java.util.*;
class t1
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		int n = s.nextInt();
		int x = (n%2==0)?1:0;
		if (x==1)
		{
			System.out.println("The entered number is even");
		}
		else
		{
			System.out.println("The entered number is odd");
		}
	}
}
