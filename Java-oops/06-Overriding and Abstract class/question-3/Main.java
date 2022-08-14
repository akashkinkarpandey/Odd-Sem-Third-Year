//qs->Implement Dynamic Method Dispatch

//input-output
// PS C:\Users\C1 20\Desktop\akashji\Day 6\question-3> javac Main.java
// PS C:\Users\C1 20\Desktop\akashji\Day 6\question-3> java Child2
// I am b function in Base class
// I am b function in Child 2 class
// I am b function in Child 1 class
// I am b function in Child 2 class
// I am b function in Child 1 class
class Base
{
    void b()
    {
        System.out.println("I am b function in Base class");
    }
}
class Child1 extends Base
{
    void b()
    {
        System.out.println("I am b function in Child 1 class");
    }
}
class Child2 extends Base
{
    void b()
    {
        System.out.println("I am b function in Child 2 class");
    }
    public static void main(String[] args) 
    {
        Base obj=new Base();
        obj.b();
        Child2 obj1=new Child2();
        obj1.b();
        Child1 obj2=new Child1();
        obj2.b();
        Base obj3=new Child2();//this is dynamic method dispatch
        obj3.b();
        Base obj4=new Child1();//this is dynamic method dispatch
        obj4.b();
    }
}
