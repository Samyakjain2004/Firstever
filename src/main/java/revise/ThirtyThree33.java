package revise;

public class ThirtyThree33 {
//Take a number and display it one by one
	public static void main(String[] args) {
		int x = 9834;
		double y = 0;
		double[] arr = new double[4];
		double[] arr1 = new double[4];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = x % Math.pow(10, i + 1) - y;
			y = y + arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i] / (10 * Math.pow(10, i));
			y = arr1[i];
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr1[i] * 10 + " ");

		}

	}
}
