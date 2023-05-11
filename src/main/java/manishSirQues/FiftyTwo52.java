package manishSirQues;
//WAP to print 2 objects of mobile and compare them
public class FiftyTwo52 {
	String color;
	String brand;
	String modelNo;
	public FiftyTwo52(String color,String brand,String modelNo) {
		this.color=color;
	}
public static void main(String[] args) {
	FiftyTwo52 a = new FiftyTwo52("black","Samsung","113");
	FiftyTwo52 b = new FiftyTwo52("black","Samsung","113");
	if (a.equals(b)) {
		System.out.println("same");
	}
	else {
		System.out.println("Not same");
	}
}
}
