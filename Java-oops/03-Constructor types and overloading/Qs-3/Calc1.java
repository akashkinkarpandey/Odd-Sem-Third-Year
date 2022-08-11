//Qs-> Create a Box class having copy constructor.
//Add a method check and return whether 2 box objects are of equal dimensions or not.

// A copy constructor in a Java class is a constructor that creates an object using another object of the same Java class.

// input-output
// PS D:\Odd-Sem-Third-Year\Java-oops\03-\Qs-3> javac Calc1.java
// PS D:\Odd-Sem-Third-Year\Java-oops\03-\Qs-3> java Calc1 4 5 6 6 5 4
// Boxes have different dimension

// PS D:\Odd-Sem-Third-Year\Java-oops\03-\Qs-3> javac Calc1.java
// PS D:\Odd-Sem-Third-Year\Java-oops\03-\Qs-3> java Calc1 1 2 3 1 2 3
// Boxes have same dimension
class Box {
    int a;
    int b;
    int c;

    Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Box(Box box) {
        this.a = box.a;
        this.b = box.b;
        this.c = box.c;
    }

    boolean check(Box b2) {
        return ((this.a == b2.a) && (this.b == b2.b) && (this.c == b2.c));
    }
}

class Calc1 {
    public static void main(String args[]) {
        try {
            Box one = new Box(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            Box two = new Box(one);
            two.a = Integer.parseInt(args[3]);
            two.b = Integer.parseInt(args[4]);
            two.c = Integer.parseInt(args[5]);
            if (one.check(two)) {
                System.out.println("Boxes have same dimension");
            } else {
                System.out.println("Boxes have different dimension");
            }
        } catch (Exception e) {
            System.out.println("Exception found was");
            e.printStackTrace();
        }
    }
}