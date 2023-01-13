class ix
{
	int sci = 100;
	int soc = 98;
	int mat = 96;
	int eng = 94;
	int tam = 88;
	int sum = (sci+soc+mat+eng+tam);
	int avg = sum/5;
	double per = sum/5.0;
	private void total(int a)
	{
		System.out.println("Total marks obtained : "+a);
	}
	private void average(int b)
	{
		System.out.println("Average marks is : "+b);
	}
	private void percent(double c)
	{
		System.out.println("Total percentage : "+c+" %");
	}
	public void result()
	{
		total(sum);
		average(avg);
		percent(per);
	}
}
