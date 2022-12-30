package revise;

public class FortySix46 {
//program to calculate the sum of the numbers occurring in the multiplication table of 8.
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			sum=sum+8*i;
		}
		System.out.println("sum- "+sum);
	}
}
