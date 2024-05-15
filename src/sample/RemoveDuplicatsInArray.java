package sample;

public class RemoveDuplicatsInArray 
{
	public static void main(String[] args) {
		int arr[] = { 9, 3, 5,9, 43, 23, 1, 2, 3, 23, 5 };
 
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					break;
				}
			}
			if(i==j) {
				System.out.print(arr[i] + " ");
			}
 
		}
	}

}
