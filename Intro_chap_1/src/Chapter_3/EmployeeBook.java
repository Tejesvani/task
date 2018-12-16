package Chapter_3;

import java.util.Scanner;

public class EmployeeBook 
{
	int id;
	String name;
	double sal;
	
	void enterData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Id: ");
		id=sc.nextInt();
		System.out.print("Name: ");
		name=sc.next();
		System.out.print("Salary: ");
		sal=sc.nextDouble();		
	}
	
	void displayData()
	{
		System.out.println("ID: "+ id);
		System.out.println("Name: "+ name);
		System.out.println("Salary: "+ sal);
	}
	
	void exitMenu()
	{
		System.exit(0);
	}
	
	public static void main(String[] args) 
	{
		int op;
		EmployeeBook eb=new EmployeeBook();
		do
		{
			System.out.println();
			System.out.println("1. Enter data");
			System.out.println("2. Display data");
			System.out.println("3. Exiting");
			System.out.print("Enter choice: ");
			Scanner sc= new Scanner(System.in);
			op=sc.nextInt();
			switch(op)
			{
			case 1: eb.enterData(); break;
			case 2: eb.displayData(); break;
			case 3: eb.exitMenu(); break;
			}
		}while(op!=3);
	}
}
