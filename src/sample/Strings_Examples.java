package sample;

public class Strings_Examples {

	public static void main(String[] args) {
		String s1 = "array";
		String s2 = ""+s1.charAt(0);
		for (int i = 1; i < s1.length(); i++) {
			char s  = s1.charAt(i);
			int count = 0;
			for (int j = 0; j < s2.length(); j++) {
				if(s ==(s2.charAt(j))) {
					count++;
				}
			}
			if (count==0) {
				s2=s2+s;
			}
			
		}
		System.out.println(s2);
	}
}