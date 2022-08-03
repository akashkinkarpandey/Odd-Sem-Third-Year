// Qs->Write a program to define a method within a class
// that returns an object when called from main

// input-output
// Value of x,y in Constructor 1 is 1,0
// After calling hey, x is 1
// Value of x,y in Constructor 1 is 2,0
// After calling hey, x is 2
public class ReturnObject {
    public static int x;
    int y;
    ReturnObject()
    {
        x++;
        System.out.println("Value of x,y in Constructor 1 is "+x+","+y);
    }
    static ReturnObject hey()//hey returns an object
    {
        ReturnObject j=new ReturnObject();//j is an object
        return j;
    }
    public static void main(String[] args) 
    {
        ReturnObject j=ReturnObject.hey();//simply writing hey() would work too
        //hey is static so we call it via class name and not object
        //hey() returns an object which is stored in j
        System.out.println("After calling hey, x is "+j.x);
        j=hey();
        System.out.println("After calling hey, x is "+j.x);
    }

}