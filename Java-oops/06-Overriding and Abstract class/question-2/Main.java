// Qs
// Create a Base class and derive 2 sub classes from it.
// Show that the methods with same name but different type,signatures are not over-riden but overloaded

// PS C:\Users\C1 20\Desktop\akashji\Day 6\question-2> javac Main.java
// PS C:\Users\C1 20\Desktop\akashji\Day 6\question-2> java Main      
// I am func() from Child 1 class 
// I am func() from Child 1 class with String return type 10
// I am func() from Child 2 class 
// I am func() from Child 2 class with StringBuffer return type 20
// I am func() from Child 1 class 
// I am func() from Child 1 class with String return type 10
// I am func() from Child 2 class 
// I am func() from Child 2 class with StringBuffer return type 20
// I am func() from Base class 
// I am func() from Base class with integer parameter 20
class Base {
    void func() {
        System.out.println("I am func() from Base class ");
    }

    Object func(int a) {
        System.out.println("I am func() from Base class with integer parameter " + a);
        return null;
    }
    //the above 2 functions are overloaded due to difference in method signature
}

class Child1 extends Base {
    void func() {
        System.out.println("I am func() from Child 1 class ");
    }

    String func(int a) {
        System.out.println("I am func() from Child 1 class with String return type " + a);
        return null;
    }
    //these functions are overloaded among themelves 
    //due to difference in method signature
    //these are also overriden from Base class
}

class Child2 extends Base {
    void func() {
        System.out.println("I am func() from Child 2 class ");
    }

    StringBuffer func(int a) {
        System.out.println("I am func() from Child 2 class with StringBuffer return type " + a);
        return null;
    }
    //these functions are overloaded among themelves 
    //due to difference in method signature
    //these functions are also overriden from Base class
}

class Main {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.func();
        c1.func(10);
        Child2 c2 = new Child2();
        c2.func();
        c2.func(20);
        Base b1 = new Child1();
        b1.func();
        b1.func(10);
        Base b2 = new Child2();
        b2.func();
        b2.func(20);
        Base b3 = new Base();
        b3.func();
        b3.func(20);
    }
}