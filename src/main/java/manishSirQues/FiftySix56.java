package manishSirQues;
//WAP to print sum of array using recursuion
import java.util.Scanner;

public class FiftySix56 {
	static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element- ");
			int x = sc.nextInt();
			arr[i] = x;
		}
		int z = insert(arr, 0);
		System.out.println("Sum" + z);
	}

	private static int insert(int[] arr, int i) {
		// TODO Auto-generated method stub
		// int sum=0;
		if (i >= arr.length) {
			return sum;
		}
		sum += arr[i];
		return insert(arr, i += 1);
	}
}
