//Qs->Create Box class with 2 parameterized constructor
//one constructor takes 3 arguments of integer type
//another constructor takes 1 argument of integer type
//create member function volume to find the volume and return it
//Use another class Demo to demonstrate working of above class by creating 2 objects

//input-output
// PS D:\Odd-Sem-Third-Year\Java-oops\03-\Qs-2> javac Calculate.java
// PS D:\Odd-Sem-Third-Year\Java-oops\03-\Qs-2> java Calculate 4 5 6 5
// 1st->Volume of cuboid is 120.0
// 2nd->Volume of cube is 125.0
class Box {
    private int l, b, h;

    Box(int l, int b, int h) {// for lets say cuboid
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(int l) {// for cube
        this.l = l;
        this.b = l;
        this.h = l;
    }

    double volume() {
        return l * b * h;
    }
}

class Calculate {
    public static void main(String args[]) {
        try {
            Box one = new Box(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            Box two = new Box(Integer.parseInt(args[3]));
            System.out.println("1st->Volume of cuboid is " + one.volume());
            System.out.println("2nd->Volume of cube is " + two.volume());
        } catch (Exception e) {
            System.out.println("Exception found was");
            e.printStackTrace();
        }
    }
}