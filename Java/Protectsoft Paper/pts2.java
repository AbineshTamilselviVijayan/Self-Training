import java.util.*;
class pts2
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int [][] a = {{1,1,1},{2,2,2},{3,4,5}};
		int temp = 0;
		for (int i = 0;i<a.length;i++)
		{
			temp = 0;
			for (int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[j][i]);
			}
			System.out.println();
		}
	}
}
