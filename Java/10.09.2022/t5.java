//CREATE A METHOD FOR OTP FEATURE
class t5
{
	public static void main(String[] args) throws Exception
	{
		otp();
	}
	public static void otp() throws Exception
	{
		System.out.println("Your OTP is getting genetrated");
		double x = Math.random()*999;
		int n = (int)x;
		double y = Math.random()*999;
		int m = (int)y;
		Thread.sleep(2000);
		System.out.print(n+" "+m);
	}
}
