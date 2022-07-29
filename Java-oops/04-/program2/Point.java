import java.util.*;
class Point {
    int x,y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    static double distance(Point p1,Point p2)
    {
        double a=Math.pow((p1.x-p2.x),2);
        double b=Math.pow((p1.y-p2.y),2);
        return Math.sqrt(a+b);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x and y coordinate of 1st point");
        Point p1=new Point(sc.nextInt(),sc.nextInt());
        System.out.println("Enter x and y coordinate of 2nd point");
        Point p2=new Point(sc.nextInt(),sc.nextInt());
        double dist=distance(p1, p2);
        System.out.println("Distance between the 2 points is "+dist); 
    }
    
}