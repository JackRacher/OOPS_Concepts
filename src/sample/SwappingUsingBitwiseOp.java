package sample;

public class SwappingUsingBitwiseOp 
{
	public static void main(String[] args) 
	{
		int a = 35;
		int b = 89;
		System.out.println("a: "+a+", b: "+b);
		a = a^b;
		b = a^b;
		a = a^b;	
		System.out.println("a: "+a+", b: "+b);
		
	}

}
