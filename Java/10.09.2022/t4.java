//WAJP TO CHECK GIVEN LETTER IS VOWEL OR CONSONENT USING SWICH
import java.util.*;
class t4
{
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a letter");
		char ch = s.next().charAt(0);
		switch (ch)
		{
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':System.out.println("The entered letter is a vowel");
		break;
			default:System.out.println("The entered letter is a consonent");
		}
	}
}
