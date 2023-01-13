class dinga 
{
	public static void main(String[] args) 
	{
		double account = 200;
		double deposit = 5000;
		System.out.println("Amount to be deposited : "+deposit);
		double balance = account + deposit;
		System.out.println("Availabe balance : "+balance);
		double withdrawal = 2000;
		System.out.println("Amount ot be withdrawed : "+withdrawal);
		balance = balance - withdrawal;
		System.out.println("Availabe balance : "+balance);
	}
}
