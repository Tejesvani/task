package Chapter_5;

import java.util.Scanner;

public class Furniture 
{
	double price;
	int ht, wt;
	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Price: ");
		price=sc.nextDouble();
		System.out.print("Height: ");
		ht=sc.nextInt();
		System.out.print("Weight: ");
		wt=sc.nextInt();
	}
	
	void display()
	{
		System.out.println("Price:"+price);
		System.out.println("Height: "+ht);
		System.out.println("Weight: "+wt);		
	}	
}
