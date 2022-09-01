package Trigonometry;
public class Trigo_calc {
    public static double sin60()
    {
        //Math.sin takes radian as input
        //so we convert 60 degree into its equivalent radian
        return Math.sin(Math.toRadians(60));
    }
    public static double cos60()
    {
        //Math.cos takes radian as input
        //so we convert 60 degree into its equivalent radian
        return Math.cos(Math.toRadians(60));
    }
    static public void display_sin()
    {
        System.out.println("sin 60 degree is "+Math.sin(Math.toRadians(60)));
    }
    static public void display_cos()
    {
        System.out.println("cos 60 degree is "+Math.cos(Math.toRadians(60)));
    }
}
