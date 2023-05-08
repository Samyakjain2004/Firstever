package manishSirQues;

//Take an array and display elements from both end like {1,2,3,4,5,6}:-   output- {1,6,2,5,3,4}
public class Thirty30 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] arr1 = new int[arr.length];
		int j = 0;
		int k = arr.length - 1;
		for (int i = 0; i < arr1.length;) {
			arr1[i] = arr[j];
			i++;
			j += 1;
			arr1[i] = arr[k];
			i++;
			k -= 1;
		}
		for (int k2 = 0; k2 < arr1.length; k2++) {
			System.out.println(arr1[k2]);
		}

	}
}
