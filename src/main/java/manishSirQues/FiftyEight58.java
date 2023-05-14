package manishSirQues;
//WAP to find avg of array using recursion
import java.util.Scanner;

public class FiftyEight58 {
	public static double sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array- ");
		double n = sc.nextDouble();
		double[] arr = new double[(int) n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element- ");
			double x = sc.nextDouble();
			arr[i] = x;
		}
		double z = insert(arr, 0);
		System.out.println("Sum" + z / n);
	}

	private static double insert(double[] arr, int i) {
		// TODO Auto-generated method stub
		// int sum=0;
		if (i >= arr.length) {
			return sum;
		}
		sum += arr[i];
		return insert(arr, i += 1);

	}
}
