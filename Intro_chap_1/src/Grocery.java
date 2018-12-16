import java.util.Scanner;

public class Grocery 
{
	int wt;
	
	void weightNow()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Wt: ");
		wt=sc.nextInt();
	}
	
	void checkWeight()
	{
		System.out.println("Weight: "+wt);
	}

	public static void main(String[] args) 
	{
		Grocery g=new Grocery();
		g.weightNow();
		g.checkWeight();
	}

}
