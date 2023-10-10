package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	
	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("james");
		names.add("Cisran");
		names.add("Paul");

		System.out.println("names list values are : " + names);

		// Names length map
		Map<String, Integer> namesLengthMap = names.stream().collect(Collectors.toMap(String::new, String::length));

		System.out.println("names length map : ;" + namesLengthMap);
		
		// Nanmes to upper case
		
		Map<String, String> namesUppercaseMap = names.stream().collect(Collectors.toMap(String::new, String::toUpperCase));

		System.out.println("names upper case map : ;" + namesUppercaseMap);
	}

}
