import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.io.* would work
//------------------------------------------
//Question
//1. Create class called Room with data members length,breadth,height
// and method Calc_Area() to calculate area of the room and display it
//2. Derive sub classes BedRoom and DrawingRoom
// BedRoom will have attached bath room ,study table and night lamp and a display() method
// DrawingRoom will have Sofa and Wall Cabinet and a display() method
//display() displays areas and other details in both classes
//------------------------------------------
//input-output
// PS D:\Odd-Sem-Third-Year\Java-oops\05-\program-1> javac Main.java
// PS D:\Odd-Sem-Third-Year\Java-oops\05-\program-1> java Main
// Enter length of Bed Room
// 5
// Enter breadth of Bed Room
// 6
// Enter height of Bed Room
// 7
// Do you want a Bathroom? Write yes or no
// yes
// Do you want a Study Table? Write yes or no
// no
// Do you want a Night Lamp? Write yes or no
// no
// ----------------
// In Bed Room
// Area is 30.0
// BathRoom is there
// Study table is not there
// Night Lamp is not there
// ----------------
// Enter length of Drawing Room
// 8
// Enter breadth of Drawing Room
// 9
// Enter height of Drawing Room
// 10
// Do you want a Sofa? Write Yes or no
// yes
// Do you want a Wall Cabinet? Write yes or no
// NO
// ----------------
// In Drawing Room
// Area is 72.0
// Sofa is there
// Wall Cabinet is not there
// ----------------
class Room {
    protected double length, breadth, height;
    static String s = " is there", s1 = " is not there";

    Room(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double Calc_Area() {
        return length * breadth;
    }
}

class BedRoom extends Room {
    double length, breadth, height;
    boolean BathRoom, StudyTable, NightLamp;

    BedRoom(double length, double breadth, double height, boolean BathRoom, boolean StudyTable, boolean NightLamp) {
        super(length, breadth, height);
        this.BathRoom = BathRoom;
        this.StudyTable = StudyTable;
        this.NightLamp = NightLamp;
        this.display(new boolean[] { BathRoom, StudyTable, NightLamp });// anonymous arrays
    }

    void display(boolean arr[]) {
        System.out.println("----------------");
        System.out.println("In Bed Room");
        System.out.println("Area is " + this.Calc_Area());
        if (arr[0] == true)
            System.out.println("BathRoom" + Room.s);
        else
            System.out.println("BathRoom" + Room.s1);
        if (arr[1] == true)
            System.out.println("Study table" + Room.s);
        else
            System.out.println("Study table" + Room.s1);
        if (arr[2] == true)
            System.out.println("Night Lamp" + Room.s);
        else
            System.out.println("Night Lamp" + Room.s1);
        System.out.println("----------------");
    }
}

class DrawingRoom extends Room {
    double length, breadth, height;
    boolean sofa, wallCabinet;

    DrawingRoom(double length, double breadth, double height, boolean sofa, boolean wallCabinet) {
        super(length, breadth, height);
        this.sofa = sofa;
        this.wallCabinet = wallCabinet;
        this.display(new boolean[] { sofa, wallCabinet });// anonymous arrays
    }

    void display(boolean arr[]) {
        System.out.println("----------------");
        System.out.println("In Drawing Room");
        System.out.println("Area is " + this.Calc_Area());
        if (arr[0] == true)
            System.out.println("Sofa" + Room.s);
        else
            System.out.println("Sofa" + Room.s1);
        if (arr[1] == true)
            System.out.println("Wall Cabinet" + Room.s);
        else
            System.out.println("Wall Cabinet" + Room.s1);

        System.out.println("----------------");
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // input for bed room
            System.out.println("Enter length of Bed Room");
            double a = Double.parseDouble(br.readLine());
            System.out.println("Enter breadth of Bed Room");
            double b = Double.parseDouble(br.readLine());
            System.out.println("Enter height of Bed Room");
            double c = Double.parseDouble(br.readLine());
            boolean b1 = false, b2 = false, b3 = false;
            System.out.println("Do you want a Bathroom? Write yes or no");
            String a1 = br.readLine().toLowerCase();
            if (a1.equals("yes"))
                b1 = true;
            System.out.println("Do you want a Study Table? Write yes or no");
            String a2 = br.readLine().toLowerCase();
            if (a2.equals("yes"))
                b2 = true;
            System.out.println("Do you want a Night Lamp? Write yes or no");
            String a3 = br.readLine().toLowerCase();
            if (a3.equals("yes"))
                b3 = true;
            BedRoom bedroom = new BedRoom(a, b, c, b1, b2, b3);

            // input for bath room
            System.out.println("Enter length of Drawing Room");
            a = Double.parseDouble(br.readLine());
            System.out.println("Enter breadth of Drawing Room");
            b = Double.parseDouble(br.readLine());
            System.out.println("Enter height of Drawing Room");
            c = Double.parseDouble(br.readLine());
            b1 = false;
            b2 = false;
            System.out.println("Do you want a Sofa? Write Yes or no");
            a1 = br.readLine().toLowerCase();
            if (a1.equals("yes"))
                b1 = true;
            System.out.println("Do you want a Wall Cabinet? Write yes or no");
            a2 = br.readLine().toLowerCase();
            if (a2.equals("yes"))
                b2 = true;
            DrawingRoom drawing = new DrawingRoom(a, b, c, b1, b2);
        } catch (Exception e) {
            System.out.println("Exception caught was");
            e.printStackTrace();
        }
    }
}