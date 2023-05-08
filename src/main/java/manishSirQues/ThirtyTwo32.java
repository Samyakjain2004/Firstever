package manishSirQues;

//Take Two array {1,2,3,4} {6,7,8,9} and multiply them like {1*9, 2*8, 3*7, 6*4}
public class ThirtyTwo32 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] arr1 = { 6, 7, 8, 9 };
		int[] arr2 = new int[arr.length];
		int j = arr.length - 1;
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i] * arr1[j];
			j--;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
