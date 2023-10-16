package sample;

public class MultiplicationOfArray 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		int b[] = new int[a.length];
		String a1="",b1="";
		
		for (int i = 0; i < a.length; i++) 
		{
			int val = 1;
			for (int j = 0; j < a.length; j++) 
			{
				if(i!=j)
				{
					val *= a[j];
				}	
			}
			b[i] = val;
		}
		for (int i = 0; i < b.length; i++) 
		{
			if(a1.length()>0||b1.length()>0)
			{
				a1 += ",";
				b1 += ",";
			}
				a1 += a[i];
				b1 += b[i];
		}
		System.out.println(a1);
		System.out.println(b1);
		
		for (int i = 0; i < a.length; i++) 
		{
			
			
		}
	}
}
