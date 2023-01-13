import java.util.*;
class vorc
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the character");
		char ch = s.next().charAt(0);
		switch (ch)
		{
		case 'a':
			System.out.println("The entered character \'"+ch+"\' is a vowel");
		break;
		case 'e':
			System.out.println("The entered character \'"+ch+"\' is a vowel");
		break;
		case 'i':
			System.out.println("The entered character \'"+ch+" is a vowel");
		break;
		case 'o':
			System.out.println("The entered character \'"+ch+"\' is a vowel");
		break;
		case 'u':
			System.out.println("The entered character \'"+ch+"\' is a vowel");
		break;
		default:System.out.println("The entered character \'"+ch+"\' is a consonent");
		}
	}
}
