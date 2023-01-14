package recursion;

public class Sum {
public static void main(String[] args) {
	int[] arr= {10,20,30,40,50};
	int sum=findSum(arr,0);
	System.out.println("Sum-" +sum);
	System.out.println("Avg-"+sum/arr.length);
}

public static int findSum(int[] arr, int i) {
	if (i>arr.length-1) {
		return 0;
	}

	return arr[i]+findSum(arr,i+1);
}
}
