package Chapter_5;

import java.util.Scanner;

public class LibHardware extends Library 
{
	String hcategory, publisher;
	
	void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		super.getDetails();
		System.out.print("H/w Category: ");
		hcategory=sc.next();
		System.out.print("Publisher: ");
		publisher=sc.next();		
	}
	
	void display()
	{
		super.display();
		System.out.println("H/w Category: "+hcategory);
		System.out.println("Publisher: "+publisher);
	}
}
