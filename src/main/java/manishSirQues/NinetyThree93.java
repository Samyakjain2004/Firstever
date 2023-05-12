package manishSirQues;

//WAP to take 2 arrays and find elements such that their sum is equal to k
public class NinetyThree93 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 23, 45, 67, 89 };
		int[] arr2 = { 76, 45, 89, 76, 43 };
		int k = 53;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] + arr2[j] == k) {
					System.out.println(arr1[i] + "in first array");
					System.out.println(arr2[j] + "in second array");
				}
			}
		}
	}
}
