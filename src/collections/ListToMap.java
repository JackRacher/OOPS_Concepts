package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
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
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		numbers.add(3);
		numbers.add(3);
		numbers.add(1);
		
		System.out.println("List: "+numbers.toString());
		
		HashMap<Integer, Integer> numberCount = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < numbers.size(); i++) {
			
			if(numberCount.containsKey(numbers.get(i))) {
				int count = numberCount.get(numbers.get(i));
				numberCount.put(numbers.get(i), count+1);
			}
			else
			{
				numberCount.put(numbers.get(i), 1);
			}
		}
		int maxkey=0,maxValue = 0;
		for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if(val>maxValue) {
				maxkey = key;
				maxValue = val;
			}
					}
		
		System.out.println("Maximum repeated number is: "+ maxkey);
		
	}

}
