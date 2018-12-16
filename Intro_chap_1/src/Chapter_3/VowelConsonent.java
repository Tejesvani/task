package Chapter_3;

import java.util.*;

public class VowelConsonent 
{
	public static void main(String[] args) 
	{
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr a char: ");
		c=sc.next().charAt(0);
		switch(c)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': System.out.println(c+" is a Vowel"); break;
			default: System.out.println(c+" is a Consonant");
		}		
	}
}
