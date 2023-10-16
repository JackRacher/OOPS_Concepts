package sample;

import java.util.ArrayList;
import java.util.List;

public class TryCatch 
{
	public static void main(String[] args) 
	{
		//System.out.println(TryCatch.name());
		String newString1 = new String("Hello"); // A new string object
		String newString2 = new String("Hello");
		
		List name = new ArrayList();
		name.add("Hi");
		System.out.println(name);
		//System.out.println(newString1==newString2);
		//System.out.println(newString2);
	}
	
	static String name()
	{
		String name ="hi";
		try 
		{
			System.out.println("Try");
			return name;
		} 
		finally 
		{
			System.exit(0);
			System.out.println("Finally");
		}
		
	}
}
