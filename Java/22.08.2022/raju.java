class raju
{
	public static void main(String[] args) 
	{
		double wallet = 1000;
		double spent = 650;
		System.out.println("Initial amount in wallet : "+wallet);
		System.out.println("Price of shoes : "+spent);
		System.out.println("After purchasing the shoes");
		wallet = wallet-spent;
		System.out.println("Amount left in wallet : "+wallet);
	}
}
