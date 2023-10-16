package sample;

public class PetersonNumber 
{
	public static void main(String[] args) 
	{
		int a = 145;
		String txt = String.valueOf(a);
		int val = 0;
		
		for (int i = 0; i < txt.length(); i++) {
			val += fact(Integer.parseInt(""+txt.charAt(i)));
		}
		if(val==a)
		{
			System.out.println("Peterson Number");
		}
		else
		{
			System.out.println("Not Peterson Number");
		}
	}
	
	static int fact(int a)
	{
		int num = 1;
		for (int i = 1; i <= a; i++) 
		{
			num *= i;			
		}
		return num;
	}

}
