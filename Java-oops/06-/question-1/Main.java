// Create a class Base with some method
// Derive another class from it which should contain a method with same name,type,signature as in the Base Class.
// Show that the sub class version of method overrides the Base class version when called from the scope of sub-class.

// input-output
// PS C:\Users\C1 20\Desktop\akashji\Day 6\question-1> javac Main.java
// PS C:\Users\C1 20\Desktop\akashji\Day 6\question-1> java Child
// I am b function in Child class
class Base
{
    void b()
    {
        System.out.println("I am b function in Base class");
    }
}
class Child extends Base
{
    void b()
    {
        System.out.println("I am b function in Child class");
    }
    public static void main(String[] args) 
    {
        Child obj=new Child();
        obj.b();
    }
}