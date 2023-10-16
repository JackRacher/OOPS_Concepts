package Inheritance;

class P
{
	public static void showData()
	{
		//System.out.println("P Class");
	}
}
class R extends P
{
	public static void showData()
	{
		System.out.println("R Class");
	}
}
public class InheritWithFinalMethod 
{
	public static void main(String[] args) 
	{
		R r = new R();
		r.showData();
		P p = new P();
		p.showData();
		
		P p1 = new R();
		p1.showData();
	}
}
