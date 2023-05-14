package manishSirQues;
//WAP to find min and max in an array using recursion
import java.util.Scanner;

public class FiftySeven57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element- ");
			int x = sc.nextInt();
			arr[i] = x;
			arr1[i] = x;
		}
		int max = arr[0];
		int min = arr[0];
		int ma = insert(arr, 0, max);
		System.out.println("max- " + ma);
		int mix = ins(arr1, 0, min);
		System.out.println("min- " + mix);
	}

	private static int ins(int[] arr1, int i, int min) {
		// TODO Auto-generated method stub
		if (i >= arr1.length) {
			return min;
		}
		if (arr1[i] <= min) {
			min = arr1[i];
		}
		return ins(arr1, i += 1, min);
	}

	private static int insert(int[] arr, int i, int max) {
		// TODO Auto-generated method stub

		if (i >= arr.length) {
			return max;
		}
		if (arr[i] >= max) {
			max = arr[i];
		}
		return insert(arr, i += 1, max);

	}
}
