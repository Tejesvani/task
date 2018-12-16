package Chapter_2;

import java.util.Scanner;

public class Temperature 
{
	public static void main(String[] args) 
	{
		int c;
		double f;
		Scanner sc =new Scanner(System.in);
		System.out.print("C: ");
		c=sc.nextInt();
		f=c*9/5+32;
		System.out.println("F: "+f+" F");

	}

}
