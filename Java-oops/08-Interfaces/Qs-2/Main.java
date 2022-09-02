public class Main implements A.I.J {
    public void show()
    {
        System.out.println("show() in Main");
    }
    public static void main(String[] args) {
        A.I.J obj=new Main();
        obj.show();
    }
}
