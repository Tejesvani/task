package Chapter_4;
import java.util.Scanner;

public class EmpBookApp 
{
	String id;
	String name,dept,desg,doj,dob,ms,dom=new String();
	Scanner sc=new Scanner(System.in);
	void enterData()
	{
		//Scanner sc=new Scanner(System.in);
		System.out.print("ID: ");
		id=sc.next();
		System.out.print("Name: ");
		name=sc.next();
		System.out.print("Dept: ");
		dept=sc.next();
		System.out.print("Designation: ");
		desg=sc.next();
		System.out.print("Date of Join: ");
		doj=sc.next();
		System.out.print("Dte of Birth: ");
		dob=sc.next();
		System.out.print("Marital Status: ");
		ms=sc.next();
		if(ms.equals("Y") || ms.equals("y"))
		{
			System.out.print("Date of Marriage: ");
			dom=sc.next();
		}		
		else 
		{
			dom="Nil";
		}
	}
	
	void displayData()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Dept: "+dept);
		System.out.println("Designation: "+desg);
		System.out.println("Joining: "+doj);
		System.out.println("Date of Birth: "+dob);
		System.out.println("Marital Status: "+ms);
		System.out.println("Date of Marriage: "+dom);
	}
	
	public static void main(String[] args) 
	{
		int n,i,p=0;
		String id;
		EmpBookApp eb[]=new EmpBookApp[10];
		for(i=0;i<10;i++)
			eb[i]=new EmpBookApp();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Emp - "+(i+1));
			eb[i].enterData();
		}
		System.out.print("Enter id: ");
		id=sc.next();
		for(i=0;i<n;i++)
		{
			if(id.equals(eb[i].id))
			{
				eb[i].displayData();
				p=1;
				break;
			}
		}
		if (p==0)
			System.out.println("ID not found");
	}
}
