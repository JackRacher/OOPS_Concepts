package sample;

public class SpyNumber 
{
	public static void main(String[] args) 
	{
		int a = 123;
		String txt = ""+a;
		int val1=0,val2=1;
		
		for (int i = 0; i < txt.length(); i++) 
		{
			val1 += Integer.parseInt(""+txt.charAt(i));
			
			val2 *= Integer.parseInt(""+txt.charAt(i));
		}
		
		if(val1==val2)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not Spy number");
		}
	}
}
