package Chapter_6;

import java.util.Scanner;

public class Emp 
{
	int age;
	String name,no;
	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Name: ");
			name=sc.next();
			System.out.print("Contact Number: ");
			no=sc.next();
			System.out.print("Age: ");
			age=sc.nextInt();
			if(age<20 || age>55)
				throw new IllegalAgeException("Invalid Age");
			
		}
		catch(IllegalAgeException e)
		{
			System.out.println(e);
			System.exit(0);
		}
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Mob No.: "+no);
		System.out.println("Age: "+age);
	}
	
	public static void main(String arg[])
	{
		Emp emp=new Emp();
		System.out.println("Enter the Details - ");
		emp.getData();
		emp.display();
	}

}
