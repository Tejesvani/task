package Chapter_3;

import java.util.Scanner;

public class Prime_n 
{
	public static void main(String arg[])
	{
		int n,i,j,p;
		Scanner sc=new Scanner(System.in);
		System.out.print("n: ");
		n=sc.nextInt();
		for(i=2;i<=n;i++)
		{
			p=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					p=1;
					break;
				}
			}
			if(p==0)
				System.out.println(i);
		}
	}
}
