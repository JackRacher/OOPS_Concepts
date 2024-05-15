package sample;

public class NullSequenceReplaceWithObj {

	public static void main(String[] args) {
        String[] str = {"a", "b", "c", null, "d", null, null, "e", null, null, null, null, null, null};

        // Define the string object
        String strobj1 = "strobj1";

        // Flag to indicate whether the previous element was null
        boolean prevNull = false;

        // Iterate through the array
        for (int i = 0; i < str.length; i++) {
            if (str[i] == null) {
                if (!prevNull && (i == str.length - 1 || str[i + 1] != null)) {
                    // If the previous element was not null and the next element is not null (or it's the last element),
                    // then replace the current null with strobj1
                    str[i] = strobj1;
                }
                prevNull = true;
            } else {
                // If the current element is not null, reset the flag
                prevNull = false;
            }
        }

        // Print the modified array
        for (String s : str) {
            System.out.print(s + ",");
        }
    }
}
