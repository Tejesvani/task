package Chapter_6;

import java.util.Scanner;

public class EmpDetails 
{
	String id,name,dept;
	
	void getData() throws IllegalIdException
	{
		try
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Emp id: ");
			id=sc.next();
			if (id.charAt(0)!='e')
					throw new IllegalIdException("Illegal ID");
			System.out.print("Emp Name: ");
			name=sc.next();
			System.out.print("Emp Dept: ");
			dept=sc.next();
		}
		catch(IllegalIdException e)
		{
			throw new IllegalIdException("Illegal ID");
		}
	}
	
	void display()
	{
		System.out.println("Emp id: "+id);
		System.out.println("Emp Name: "+name);
		System.out.println("Emp Dept: "+dept);
	}
	
	public static void main(String arg[])
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
		EmpDetails emp=new EmpDetails();
		do {
		System.out.println("1. Enter");
		System.out.println("2. Display");
		System.out.println("3. Exit");
		System.out.print("Enter choice: ");
		try
		{
			c=sc.nextInt();
			if(c<1 || c>3)
				throw new IllegalArgumentException("Illegal Input");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
		switch(c)
		{
		case 1: System.out.println("Enter details of Emp - ");
				try
				{
					emp.getData();
				}
				catch(IllegalIdException e)
				{
					System.out.print(e);
					continue;
				}
		case 2: System.out.println();
				System.out.println("Emp Details - ");
				emp.display();
				break;
		case 3: System.exit(0);		
		}
		}while(true);
	}
	
}
