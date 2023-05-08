package manishSirQues;

import java.util.Iterator;

//Display from towards both end like {1,2,3,4,5}:-   output- {3,2,4,1,5}
public class ThirtyOne31 {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	int [] arr1=new int[arr.length];
	int j=(arr.length-1)/2;
	int k=(arr.length-1)/2;
	for (int i =0; i < arr1.length;) {
		arr1[i]=arr[j];
		j--;
		i++;
		k++;
		arr1[i]=arr[j];
		i++;
		arr1[i]=arr[k];
		
		j--;
		i++;
	}
}
}
