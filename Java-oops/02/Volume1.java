import java.util.*;
//Qs
//Create a Box class 
//add a paramterized constructor to initialize data members
//Write another method to return volume
//create a cuboid and cube ,find which one is bigger. 

//input-output
// Enter length,breadth,height of cuboid
// 4 3 5
// Enter side of cube
// 3
// Volume of Cuboid is 60.0
// Volume of Cube is 27.0
// Cuboid has greater volume
class Box1 {
	double length, breadth, height;

	Box1(double l, double b, double h) {
		//  parameterized constructor
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
		} else if (first < second) {
			System.out.println("Cube has greater volume");
		} else {
			System.out.println("Cube and cuboid have same volume");
		}
		sc.close();
	}
}