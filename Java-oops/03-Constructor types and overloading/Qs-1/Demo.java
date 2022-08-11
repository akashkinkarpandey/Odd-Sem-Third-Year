//Qs->Create Box class
//Create all possible type of constructors and display
//Demonstrate calling of each type of constructor

// input-output
// PS D:\Odd-Sem-Third-Year\Java-oops\03-\Qs-1> javac Demo.java
// PS D:\Odd-Sem-Third-Year\Java-oops\03-\Qs-1> java Demo 2 3 4 5 1 2
// length is 2 breadth is 3 height is 4
// length is 5 breadth is 1 height is 2
class Box {
	int l, b, h;
	Box() {
		// default constructor
	}
	Box(int l, int b, int h) {//constructor overloading
		// paramterized constructor
		this.l = l;
		this.b = b;
		this.h = h;
	}
	//no need to create copy constructor
	void display() {
		System.out.println("length is " + l + " breadth is " + b + " height is " + h);
	}
}

class Demo {
	public static void main(String args[]) {
		try {
			Box one = new Box(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
			Box two = new Box();
			two.l = Integer.parseInt(args[3]);
			two.b = Integer.parseInt(args[4]);
			two.h = Integer.parseInt(args[5]);
			one.display();
			two.display();
		} catch (Exception e) {
			System.out.println("Exception Found was");
			e.printStackTrace();
		}
	}
}