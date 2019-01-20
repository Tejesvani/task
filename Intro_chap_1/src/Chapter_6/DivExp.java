package Chapter_6;

import java.util.Scanner;

public class DivExp 
{
	public static void main(String arg[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("a: ");
			a=sc.nextInt();
			System.out.print("b: ");
			b=sc.nextInt();
			if (b==0)
				throw new IllegalArgumentException("Denominator cannot be 0");
			else
				System.out.println("Division result: "+(a/b));
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}

}
