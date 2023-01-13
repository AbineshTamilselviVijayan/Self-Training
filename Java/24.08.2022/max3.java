class max3 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 5;
		int res = (a>b)?a:b;
		int res1 = (res>c)?res:c;
		System.out.println("The greatest of three numbers is : "+res1);
	}
}
