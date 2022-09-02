public class Main {
    void display_in_Main()
    {
        System.out.println("I am display method in Main");
    }
    public static void main(String[] args) {
        I obj1=new A();
        obj1.show();
        I obj2=new B();
        obj2.show();
        // obj1 and obj2 are interface type reference variables
        // these reference variables cannot acces Main class' methods
        // obj1.display_in_Main(); //this line shows error
        // obj2.display_in_Main(); //this line shows error
        // obj1.show1(); //obj1 cant access methods specific to A
        // obj2.show1(); //obj2 cant access methods specific to B
        Main obj3=new Main();
        obj3.display_in_Main();
        //reference type of Main can call Main class methods.
    }
}
