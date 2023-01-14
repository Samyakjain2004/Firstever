package recursion;

public class MaxMin {
public static void main(String[] args) {
	int[] arr= {10,30,50,20,5};
	int max=findMax(arr,0,arr[0]);
	int min=findMin(arr,0,arr[0]);
	System.out.println("Max-"+max);
	System.out.println("Min-"+min);
}
private static int findMin(int[] arr, int i, int min) {
	
	if (i>arr.length-1) {
		return min;
	}
	if (min>arr[i]) {
		min=arr[i];
	}
	return findMin(arr,i+1,min);
}
public static int findMax(int[] arr,int i,int max) {
	if (i>arr.length-1) {
		return max;
	}
	if (max>arr[i]) {
		
	}
	if (arr[i]>max) {
		max=arr[i];
	}
	
	return findMax(arr,i+1,max);
}
}
