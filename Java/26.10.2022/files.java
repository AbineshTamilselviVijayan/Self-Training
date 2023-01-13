import java.io.*;
class files
{
	public static void main(String[] args) 
	{
		FileWriter leo = new FileWriter("Abi.txt");
		leo.createNewFile();
		leo.write("I am invincible");
		leo.close();
	}
}
