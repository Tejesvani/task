package Chapter_5;

import java.util.Scanner;

public class LibSoftware extends Library
{
	private String version, sname;
	
	void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		super.getDetails();
		System.out.print("s/w Version: ");
		version=sc.next();
		System.out.print("S/w Name: ");
		sname=sc.next();		
	}
	
	void display()
	{
		super.display();
		System.out.println("s/w Version: "+version);
		System.out.println("S/w Name: "+sname);
	}
}
