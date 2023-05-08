package manishSirQues;
//Take two arrays of characters and display one by one {“a” , “c” , “e”} , {“b” , “d” , “f”}output-(a,b,c,d,e,f)

public class TwentyEight28 {
	public static void main(String[] args) {
		char[] arr = { 'a', 'c', 'e' };
		char[] arr1 = { 'b', 'd', 'f' };
		char[] arr2 = new char[arr.length + arr1.length];
		int j = 0;
		for (int i = 0; i < arr2.length;) {
			arr2[i] = arr[j];
			i++;
			arr2[i] = arr1[j];
			i++;
			j++;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
