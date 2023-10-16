package sample;

public class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		int a = 25;
		String mainVal = String.valueOf(a);
		int val = a*a;
		String txt = String.valueOf(val);
		
		if(a==Integer.parseInt(""+txt.substring(txt.length()-mainVal.length(),txt.length())))
		{
			System.out.println("Automorphic Number");
		}
		else
		{
			System.out.println("Not Automorphic Number");
		}
		
	}

}
