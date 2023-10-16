package sample;

public class RecursionImpl 
{
	static int a[] = {1,2,3,4,5};
	static int b[] = new int[a.length];
	static String b1 = "";
	public static void main(String[] args) 
	{
		multiVal(0);
		System.out.println(b1);
		
	}
	
	static void multiVal(int num)
	{
		b[num] = 1;
		for (int i = 0; i < RecursionImpl.a.length; i++) 
		{
			if(i!=num)
			{
				b[num] *= a[i]; 
			}
			if(i==a.length-1)
			{
				if(b1.length()>0)
					b1 +=",";
				
				b1 += b[num];
				if(num<a.length-1)
					multiVal(num+1);
			}
		}
		
	}

}
