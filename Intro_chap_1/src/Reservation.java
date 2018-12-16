
public class Reservation 
{
	int tid;
	
	Reservation(int t)
	{
		tid=t;
	}
	
	void showTicket()
	{
		System.out.println("ID: "+tid);
	}
	
	public static void main(String arg[])
	{
		Reservation r=new Reservation(501);
		r.showTicket();
	}

}
