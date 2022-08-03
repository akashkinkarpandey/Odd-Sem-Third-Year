//qs-> Demonstrate Working of Nested Classes

//input-output
// Outside constructor called
// Inside constructor called
// y from Outer class x is 20
// y from Inner class x is 16
// I am in Print_Outside function of Outside class
// I am in Print_Inside function of Inside class
// I am in static Print_Outside 1 function of Outside class
// I am hello from Outside class
// I am hello from Inside class
class Outside {
    int x;
    static int x1;
    Outside()
    {
        x=5;x1=15;
        System.out.println("Outside constructor called");
    }
    class Inside 
    {
        int y;
        int x;//shadowing
        Inside()
        {
            System.out.println("Inside constructor called "); 
            //simply writing x1 instead of Outside.x1 works as well
            //Outside.this.x refers to x of Outer class
            y+=Outside.this.x+Outside.x1;//non static Inside class can access both static and non static mebers of Outside class
            System.out.println("y from Outer class x is "+y);
            y=0;x=1;
            y+=this.x+x1;//this.x refers to x of Inside class
            System.out.println("y from Inner class x is "+y);

        }
        void Print_Inside() {
            System.out.println("I am in Print_Inside function of Inside class");
        }
        // The method Print_Inside1 cannot be declared static; static methods can only be declared in a static or top level type
        // static void Print_Inside1() {
        //     System.out.println("I am in static Print_Inside 1 function of Inside class");
        // }
        void hello()
        {
            System.out.println("I am hello from Inside class");
        }
    }
    void Print_Outside() {
        System.out.println("I am in Print_Outside function of Outside class");
    }
    static void Print_Outside1() {
        System.out.println("I am in static Print_Outside 1 function of Outside class");
    }
    void hello()
    {
        System.out.println("I am hello from Outside class");
    }
}

class Example2 {
    public static void main(String[] args) {
        Outside o=new Outside();//creating object of Outside class
        Outside.Inside i=o.new Inside();//creating object of Inside class
        o.Print_Outside();//calling non static function with objects
        i.Print_Inside();
        Outside.Print_Outside1();//calling static function without object
        //i.Print_Inside1(); 
        o.hello();
        i.hello();
    }
}