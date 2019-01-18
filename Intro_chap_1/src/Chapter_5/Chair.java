package Chapter_5;

import java.util.Scanner;

public class Chair extends Furniture 
{
	String type,color;
	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		super.getData();
		System.out.print("Type [Wooden/Plastic]: ");
		type=sc.next();
		System.out.print("Colour: ");
		color=sc.next();
	}
	
	void display()
	{
		super.display();
		System.out.println("Type: "+type);
		System.out.println("Colour: "+color);
	}

}
