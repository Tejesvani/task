package Chapter_5;

public class FurnMain 
{
	public static void main(String arg[])
	{
		Chair c=new Chair();
		System.out.println("Enter Data for Chair - ");
		c.getData();
		c.display();
		
		Shelf s=new Shelf();
		System.out.println("Enter Data for Book Shelf - ");
		s.getData();
		s.display();
	}

}
