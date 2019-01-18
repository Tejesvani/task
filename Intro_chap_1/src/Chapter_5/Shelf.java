package Chapter_5;

import java.util.Scanner;

public class Shelf extends Furniture 
{
	int racks;
	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		super.getData();
		System.out.print("No. of Racks: ");
		racks=sc.nextInt();
	}
	
	void display()
	{
		super.display();
		System.out.println("No. of Racks: "+racks);
	}
}
