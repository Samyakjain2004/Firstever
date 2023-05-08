package manishSirQues;
//Write a program to find the factorial value of any number entered through the keyboard. 

import java.util.Scanner;

public class ThirtyNine39 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter first no");
	int x=sc.nextInt();
	System.out.println("Enter second no");
	int y=sc.nextInt();
	int z=div(x,y);
	System.out.println("HCF of "+x+" & "+y+" is "+z);
}

private static int div(int x, int y) {
	// TODO Auto-generated method stub
	for(int i=2;i<=x*y;i++) {
		if (x%i==0 && y%i==0) {
			return i;
		}
		
	}
	return x*y;
}
}
