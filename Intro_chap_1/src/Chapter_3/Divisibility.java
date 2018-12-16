package Chapter_3;

import java.util.Scanner;

public class Divisibility 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("a: ");
		a=sc.nextInt();
		System.out.print("b: ");
		b=sc.nextInt();
		if (b==0)
			System.out.println("Division by Zero");
		else if (a%b==0)
			System.out.println(a+" is divisible by "+b);
		else
			System.out.println(a+" is not divisible by "+b);
	}
}
