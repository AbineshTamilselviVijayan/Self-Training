//WAJP TO FIND LARGEST OF 3 NUMBER USING CONDITIONAL OPERATOR?
import java.util.*;
class t2
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the first number");
		int b = s.nextInt();
		System.out.println("Enter the first number");
		int c = s.nextInt();
		int x = (a>b)?a:b;
		int y = (x>c)?x:c;
		System.out.println("The largest of three numbers is : "+y);
	}
}
