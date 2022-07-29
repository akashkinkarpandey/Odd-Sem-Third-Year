public class Sample {
    public static int x;
    Sample()
    {
        x++;
        System.out.println("Value of x in constructor 1 is "+x);
    }
    static Sample hey()
    {
        Sample j=new Sample();
        return j;
    }
    public static void main(String[] args) {
        Sample s=new Sample();
        Sample j=hey();
        System.out.println("After calling hey, x is "+j.x);
        j=hey();
        System.out.println("After calling hey, x is "+j.x);
    }

}