import java.util.Scanner;

public class Employee 
{
	public static void main(String[] args) 
	{
		int op;
		System.out.println("1. Enter data");
		System.out.println("2. Update data");
		System.out.println("3. Display data");
		System.out.println("4. Exiting");
		System.out.print("Enter choice: ");
		Scanner sc= new Scanner(System.in);
		op=sc.nextInt();
		switch(op)
		{
		case 1: System.out.println("Enter data"); break;
		case 2: System.out.println("Update data"); break;
		case 3: System.out.println("Display data"); break;
		case 4: System.out.println("Exiting"); break;
		}
	}
}
