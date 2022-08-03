//qs-> Demonstrate Working of Nested Classes

//input
// Outer constructor called
// Inner constructor called
// I am in Print_Outer function of Outer class
// I am in Print_Inner function of Inner class
// I am in static Print_Outer 1 function of Outer class
// I am in static Print_Inner 1 function of Inner class
// I am hello from Outer class
// I am hello from Inner class
class Outer {
    Outer()
    {
        System.out.println("Outer constructor called");
    }
    static class Inner 
    {
        Inner()
        {
            System.out.println("Inner constructor called"); 
        }
        void Print_Inner() {
            System.out.println("I am in Print_Inner function of Inner class");
        }
        static void Print_Inner1() {
            System.out.println("I am in static Print_Inner 1 function of Inner class");
        }
        void hello()
        {
            System.out.println("I am hello from Inner class");
        }
    }
    void Print_Outer() {
        System.out.println("I am in Print_Outer function of Outer class");
    }
    static void Print_Outer1() {
        System.out.println("I am in static Print_Outer 1 function of Outer class");
    }
    void hello()
    {
        System.out.println("I am hello from Outer class");
    }
}

class Example1 {
    public static void main(String[] args) {
        Outer o=new Outer();//creating object of outer class
        Outer.Inner i=new Outer.Inner();//creating object of inner class
        o.Print_Outer();//calling non static function with objects
        i.Print_Inner();
        Outer.Print_Outer1();//calling static functions without objects
        Outer.Inner.Print_Inner1();
        o.hello();
        i.hello();
    }
}