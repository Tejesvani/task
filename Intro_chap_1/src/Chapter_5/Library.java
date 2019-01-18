package Chapter_5;

import java.util.Scanner;

public class Library 
{
	String author, title;
	double price;
	int stk, pg;
	
	void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Title: ");
		title=sc.next();
		System.out.print("Author: ");
		author=sc.next();
		System.out.print("Price: ");
		price=sc.nextDouble();
		System.out.print("Stock: ");
		stk=sc.nextInt();
		System.out.print("Pages: ");
		pg=sc.nextInt();		
	}
	
	void display()
	{
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
		System.out.println("Stock: "+stk);
		System.out.println("Pages: "+pg);
	}
}
