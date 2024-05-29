package sample;

import java.util.Scanner;

public class AnagramWithoutUsingInbuiltMethods {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		boolean result = false;
		if (a.length() != b.length()) {
			return result;
		}
		String[] aNew = sortString(a.toLowerCase());
		String[] bNew = sortString(b.toLowerCase());
		int count = 0;
		for (int i = 0; i < aNew.length; i++) {
			for (int j = 0; j < bNew.length; j++) {
				if (aNew[i].equals(bNew[j])) {
					count++;
				}
			}
		}
		if (count == aNew.length) {
			result = true;
		}
		return result;
	}

	static String[] sortString(String s) {
		String stringARD = "";
		for (int i = 0; i < s.length(); i++) {
			if (!stringARD.contains(s.charAt(i) + "")) {
				stringARD += s.charAt(i);
			}
		}
		String[] stringArray = new String[stringARD.length()];

		for (int i = 0; i < stringARD.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (stringARD.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			stringArray[i] = stringARD.charAt(i) + "-" + count;
		}
		return stringArray;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
