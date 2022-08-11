// Qs-> Demonstrate method overloading with some examples.
//Points:-
// Method overloading occurs in same class
// Methods with same name but different parameter list are overloaded
// strictly speaking->different method signature is required for overloading
// this is compile time polymorphism or static polymorphism or early binding

// input-output
// PS D:\Odd-Sem-Third-Year\Java-oops\03-\Qs-4> javac Calc.java
// PS D:\Odd-Sem-Third-Year\Java-oops\03-\Qs-4> java Calc 45 89 44
// Non parameterized constructor called
// Parameterized constructor called 45
// First function called
// Second function with integer argument called 89
// Second function with double argument called 44.0

class Hello {
    int a;

    Hello() {
        System.out.println("Non parameterized constructor called ");
    }

    Hello(int a) { //constructore is special type of funton which has been overloaded here
        System.out.println("Parameterized constructor called " + a);
    }

    void f() {
        System.out.println("First function called");
    }

    void f(int d) { //this is an overloaded function
        System.out.println("Second function with integer argument called " + d);
    }

    // Below function has same method signature as above function
    // int f(int d) { //this is not an overloaded function
    //     System.out.println("Second function called " + d);
    // }

    void f(double a) { //this is an overloaded function as method signature is different
        System.out.println("Second function with double argument called " + a);
    }
}

class Calc {
    public static void main(String args[]) {
        try {
            Hello a = new Hello();
            Hello b = new Hello(Integer.parseInt(args[0]));
            b.f();
            b.f(Integer.parseInt(args[1]));
            b.f(Double.parseDouble(args[2]));
        } catch (Exception e) {
            System.out.println("Exception found was");
            e.printStackTrace();
        }
    }
}