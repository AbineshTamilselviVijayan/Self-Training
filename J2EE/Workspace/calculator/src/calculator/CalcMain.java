package calculator;
import java.util.*;
public class CalcMain {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			System.out.println("**********WELCOME**********");
			System.out.println("Please select anyone to perform");
			System.out.println("1-Addition");
			System.out.println("2-Substraction");
			System.out.println("3-Multiplication");
			System.out.println("4-Division");
			System.out.println("5-Exit");
			System.out.println("What to do ?");
			int key = s.nextInt();
			switch (key) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:	
				System.out.println("Thank you for using the application");
				System.exit(0);
				break;
			default:
				System.out.println("Input error");
			}
		}
	}

}
