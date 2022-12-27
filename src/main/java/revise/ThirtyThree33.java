package revise;

public class ThirtyThree33 {
//Take a number and display it one by one
	public static void main(String[] args) {
		double x = 9834;
		double y=0;
		double[] arr = new double[4];
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = (x %(Math.pow(10, i+1)))-y;
			arr[i]=y;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
	}
}
