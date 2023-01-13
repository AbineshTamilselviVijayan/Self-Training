import java.text.*;
import java.util.*;
class pts21
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter amount");//$1_00_700:_50 cents
		double am = s.nextDouble();
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		String cu = formatter.format(am);
		System.out.println(cu+" cents");
	}
}
