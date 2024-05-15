package sample;

public class NullReplaceWithStrObj 
{
	public static void main(String[] args) 
	{
		String[] str = {"a","b",null,"c",null,null,null,"d",null,null,null,null,null,null};
		String strobj = "Strobj";
		for (int i = str.length-1; i > 1; i--) 
		{
			if(str[i-1]==str[i])
			{
				str[i-1] = strobj;
			}
			if(str[i-1]!=null && str[i-1]!=strobj)
			{
				break;
			}
		}
		String s = "";
		for (String string : str) {
			if(s.length()>0)
				s += ",";
			
			s+=string;
		}
		System.out.println(s);
	}
}
