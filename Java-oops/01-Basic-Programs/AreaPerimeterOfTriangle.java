//qs->take input of 3 sides of triangle
//calculate their perimeter and area
//PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> javac AreaPerimeterOfTriangle.java
// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> java AreaPerimeterOfTriangle 3 4 5
// Perimeter is 12
// Area is 6.0

//some points:-
//no need to include any library for Math.sqrt(int)
public class AreaPerimeterOfTriangle {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        System.out.println("Perimeter is "+(a+b+c));
        double s=(a+b+c)/2.0;
        double A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is "+A);
    }
}
