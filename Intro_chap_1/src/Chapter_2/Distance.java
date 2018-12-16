package Chapter_2;

import java.util.Scanner;

public class Distance 
{
	int u,t,a;
	double d;
	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Velocity: ");
		u=sc.nextInt();
		System.out.print("Time: ");
		t=sc.nextInt();
		System.out.print("Accleration: ");
		a=sc.nextInt();
		d=((u*t)+(a*t*t)/2);		
	}
	
	void showDist()
	{
		System.out.println("Distance: "+d);
	}
	
	public static void main(String[] args) 
	{
		Distance d=new Distance();
		d.getData();
		d.showDist();
	}

}
