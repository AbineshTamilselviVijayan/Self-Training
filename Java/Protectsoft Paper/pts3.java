import java.util.*;
class pts3 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n = 4;
		int k = 1;
		int m = n;
		for (int i = 0;i<n;i++)
		{
			k = 1;
			for (int j = 0;j<n*2;j++)
			{
				if (((i==0)&&(j==4)) || ((i==1)&&((j==3)||(j==5))) || ((i==2)&&((j==2)||(j==6)||(j==4))) || ((i==3)&&((j==1)||(j==7)||(j==3)||(j==5))))
				{
					System.out.print(k+" ");
					k++;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
//conformatoin pending