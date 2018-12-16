package Chapter_3;

import java.util.Scanner;

public class NumericPattern 
{
	public static void main(String arg[])
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("n: ");
		n=sc.nextInt();
		for(i=n;i>0;i--)
		{
			for(j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
	}
}
