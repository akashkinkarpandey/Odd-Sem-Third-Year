import java.util.*;

class Box1 {
	double length, breadth, height;

	Box1(double l, double b, double h) {
		length = l;
		breadth = b;
		height = h;
	}

	public double findVol() {
		return length * breadth * height;
	}
}

public class Volume1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length,breadth,height of cuboid");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		Box1 rectangle = new Box1(l, b, h);
		System.out.println("Enter side of cube");
		double a = sc.nextDouble();
		Box1 cube = new Box1(a, a, a);
		double first = rectangle.findVol();
		double second = cube.findVol();
		System.out.println("Volume of Cuboid is " + first);
		System.out.println("Volume of Cube is " + second);
		if (first > second) {
			System.out.println("Cuboid has greater volume");
		} else {
			System.out.println("Cube has greater volume");
		}
		sc.close();
	}
}