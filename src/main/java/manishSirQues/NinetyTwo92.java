package manishSirQues;

import java.util.Scanner;

//WAP to take 2 arrays and print common
public class NinetyTwo92 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 23, 45, 67, 89 };
		int[] arr2 = { 76, 45, 89, 76, 43 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
