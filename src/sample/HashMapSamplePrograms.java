package sample;

import java.util.HashMap;
import java.util.Map;

class Student
{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int age) {
		super();
		this.age = age;
	}
	
}
public class HashMapSamplePrograms 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Pruthvi");
		map.put(10, "Zak");
		System.out.println(map.toString());
		
		Map<String, String> mapStr = new HashMap<String, String>();
		mapStr.put("PR", "Pruthvi");
		mapStr.put("PR", "Zak");
		System.out.println(mapStr.toString());
		
		Map<Student, String> mapObj = new HashMap<Student, String>();
		mapObj.put(new Student(25), "Pruthvi");
		mapObj.put(new Student(25), "Zak");
		System.out.println(mapObj.toString());
		
	}
}
