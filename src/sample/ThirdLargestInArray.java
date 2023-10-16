package sample;

public class ThirdLargestInArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,8,4,5,12,2,96,6,7,1,56,8,34,35,36};

        int f=0, s=0, t=0;
        f = s = t = arr[0];
        for (int j = 0; j < arr.length; j++)
        {
        	int i = arr[j];
            if (f < i)
            {
            	s = f;
                f = i;
            }
            if (s < i && f > i)
            {
            	t = s;
                s = i;
            }
            if (t < i && s > i)
            {
                 t=i;
            }
            System.out.println("i: "+i+", f: "+f+", s: "+s+", t: "+t);
        }
        System.out.println("Third Largest element: "+t);
        System.out.println("f: "+f+",s: "+s+",t: "+t);
	}
}
