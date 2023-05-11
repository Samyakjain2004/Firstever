package manishSirQues;

import java.util.Scanner;

//WAP to get binary of no
public class SixtyEight68 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no- ");
		int n = sc.nextInt();
		int[] arr=new int[32];
		//if (n <= 127) {
			
			for (int i = 0; i <= 31; i++) {
				if ((n >> i & 1) == 1) {
					arr[i]=1;
				} else {
					arr[i]=0;
				}
			}
			for (int i = arr.length-1; i >=0; i--) {
				System.out.print(arr[i]);
			}
		
	}
}
