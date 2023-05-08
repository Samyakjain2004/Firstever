package manishSirQues;

//Take two arrays of int and insert the sum of consecutive element into another array  like {1,2,3} {4,5,6} :-     output- {5,7,9}
public class TwentyNine29 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int[] arr1 = { 4, 5, 6 };
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i] + arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}