import java.util.*;
//qs-> Create a  class Point for storing coordinates of geometrical points
//Write static method to calculate distance between 2 points

// input-output
// Enter x and y coordinate of 1st point
// 5 0
// Enter x and y coordinate of 2nd point
// 0 5
// Distance between the 2 points is 7.0710678118654755

// Enter x and y coordinate of 1st point
// 3 0
// Enter x and y coordinate of 2nd point
// 0 4
// Distance between the 2 points is 5.0
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static double distance(Point p1, Point p2) {
        double a = Math.pow((p1.x - p2.x), 2);
        double b = Math.pow((p1.y - p2.y), 2);
        return Math.sqrt(a + b);
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter x and y coordinate of 1st point");
            Point p1 = new Point(sc.nextInt(), sc.nextInt());
            System.out.println("Enter x and y coordinate of 2nd point");
            Point p2 = new Point(sc.nextInt(), sc.nextInt());
            double dist = Point.distance(p1, p2);// distance(p1,p2) works as well
            // distance is static so no need to create object
            System.out.println("Distance between the 2 points is " + dist);
        } catch (Exception e) {
            System.out.println("Exception thrown was:-");
            e.printStackTrace();
        }
    }

}