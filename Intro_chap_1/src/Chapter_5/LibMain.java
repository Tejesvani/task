package Chapter_5;

import java.util.Scanner;

public class LibMain 
{
	public static void main(String[] args) 
	{
		LibSoftware s=new LibSoftware();
		LibHardware h=new LibHardware();
		int c;
		Scanner sc=new Scanner(System.in);
		do 
		{
			System.out.println("1. S/w");
			System.out.println("2. H/w");
			
			System.out.print("Enter choice: ");
			c=sc.nextInt();
			switch(c)
			{
			case 1: System.out.println("Enter details - ");
					s.getDetails();
					s.display();
					break;
			case 2: System.out.println("Enter details - ");
					h.getDetails();
					h.display();
					break;
			default: System.exit(0);
			}
			
		} while (c==1 || c==2);
	}

}
