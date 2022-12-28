package revise;

public class TwentyOne {
//Make odd position twice in array
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
		for (int j = 0; j < arr.length; j++) {
			if (j % 2 == 0) {
				System.out.print(2 * arr[j]+" ");
			} else {
				System.out.print(arr[j]+" ");
			}
		}

	}
}
