import java.util.*;
//Qs
//Create a Box class and create method setData() to initialize members
//Write another method to return volume
//create a cuboid and cube ,find which one is bigger. 

//input-output
// Enter length,breadth,height of cuboid
// 4 5 6
// Enter side of cube
// 5
// Volume of Cuboid is 120.0
// Volume of Cube is 125.0
// Cube has greater volume

//input-output
// Enter length,breadth,height of cuboid
// 1 1 1
// Enter side of cube
// 1
// Volume of Cuboid is 1.0
// Volume of Cube is 1.0
// Cube and cuboid have same volume
class Box {
	double length, breadth, height;

	public void setData(double l, double b, double h) {
		length = l;
		breadth = b;
		height = h;
	}

	public double findVol() {
		return length * breadth * height;
	}
}

public class Volume {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Box rectangle = new Box();
		Box cube = new Box();
		System.out.println("Enter length,breadth,height of cuboid");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		rectangle.setData(l, b, h);
		System.out.println("Enter side of cube");
		double a = sc.nextDouble();
		cube.setData(a, a, a);
		double first = rectangle.findVol();
		double second = cube.findVol();
		System.out.println("Volume of Cuboid is " + first);
		System.out.println("Volume of Cube is " + second);
		if (first > second) {
			System.out.println("Cuboid has greater volume");
		} else if (first < second) {
			System.out.println("Cube has greater volume");
		} else {
			System.out.println("Cube and cuboid have same volume");
		}
		sc.close();
	}
}