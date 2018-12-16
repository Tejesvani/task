package Chapter_2;

import java.util.Scanner;

public class Volume 
{
	public static void main(String[] args) 
	{
		int r,h;
		double v;
		Scanner sc=new Scanner(System.in);
		System.out.print("Radius: ");
		r=sc.nextInt();
		System.out.print("Height: ");
		h=sc.nextInt();
		v=3.14*r*r*h;
		System.out.println("Volume: "+v);
	}

}
