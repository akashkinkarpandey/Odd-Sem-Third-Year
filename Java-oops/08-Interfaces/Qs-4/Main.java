public class Main implements Child_I
{
    public void show()
    {
        System.out.println("Show in Main");
    }
    public void show1()
    {
        System.out.println("Show 1 in Main");
    }
    public static void main(String[] args) {
        Child_I obj=new Main();
        obj.show();
        obj.show1();
    }
}
