class driver 
{
	public static void main(String[] args) 
	{
		A ref = new A();
		ref.dance();//rock
		B ref1 = new B();
		ref1.dance();//hip-hop
		A ref2 = new B();
		ref2.dance();//hip-hop
	}
}
