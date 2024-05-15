package sample;

import java.util.Objects;

class Laptop {
	int model;
	String name;
//	@Override
//	public int hashCode() {
//		return Objects.hash(model, name);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Laptop other = (Laptop) obj;
//		return model == other.model && Objects.equals(name, other.name);
//	}

	
	  
  
}

class HashcodeAndEqualsProgram {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		Laptop obj1 = new Laptop();
		Laptop obj2 = new Laptop();

		obj1.model = 1;
		obj1.name = "ASUS";

		obj2.model = 1;
		obj2.name = "ASUS";

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

		System.out.println(obj1.equals(obj2));
		System.out.println(obj1==obj2);
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.equals(s2));
		System.out.println(s1==s2);
}
}
