import java.util.*;

class Box2 {
	double length, breadth, height;

	Box2() {
	}

	public double findVol() {
		return length * breadth * height;
	}
}

public class Volume2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length,breadth,height of cuboid");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		Box2 rectangle = new Box2();
		rectangle.length = l;
		rectangle.breadth = b;
		rectangle.height = h;
		System.out.println("Enter side of cube");
		double a = sc.nextDouble();
		Box2 cube = new Box2();
		cube.length = a;
		cube.breadth = a;
		cube.height = a;
		double first = rectangle.findVol();
		double second = cube.findVol();
		System.out.println("Volume of Cuboid is " + first);
		System.out.println("Volume of Cube is " + second);
		if (first > second) {
			System.out.println("Cuboid has greater volume");
		} else {
			System.out.println("Cube has greater volume");
		}
	}
}