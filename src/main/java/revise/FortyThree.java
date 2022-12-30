package revise;

public class FortyThree {
	//program to print following :
//	i)
//	**********
//	**********
//	**********
//	**********
//	ii)
//	*
//	**
//	***
//  ****
//  *****
//	iii)
//	        *
//	      **
//	    ***
//	  ****
//	*****
//	iv)
//	        *
//	      ***
//	    *****
//	  *******
//	*********
//	v)
//	        1
//	      222
//	    33333
//	  4444444
//	555555555
//	vi)
//	        1
//	      212
//	    32123
//	  4321234
//	543212345

public static void main(String[] args) {
	System.out.println("i");
	for(int i=0;i<4;i++) {
		System.out.println("**********");
	}
	
	System.out.println("ii");
	for(int i=0;i<5;i++) {
		System.out.println();
		for(int j=0;j<5;j++) {
			System.out.print();
		}
	}
}
}