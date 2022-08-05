class Room 
{
    double length, breadth, height;
    static String s=" is there ",s1=" is not there ";
    Room(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    double Calc_Area() 
    {
        return length * breadth;
    }
    void display(int flag,boolean arr[])
    {
        System.out.println("Length is "+length);
        System.out.println("Breadth is "+breadth);
        System.out.println("Height is "+height);
        System.out.println("Area is "+Calc_Area());

        if(flag==1)
        {
            if(arr[0]==true)
                System.out.println("BathRoom"+s);
            else
                System.out.println("BathRoom"+s1);
            if(arr[1]==true)
                System.out.println("Study table"+s);
            else
                System.out.println("Study table"+s1);
            if(arr[2]==true)
                System.out.println("Night Lamp"+s);
            else
                System.out.println("Night Lamp"+s1);
        }
        else
        {
            if(arr[0]==true)
            System.out.println("Sofa"+s);
            else
            System.out.println("Sofa"+s1);
            if(arr[1]==true)
            System.out.println("Wall Cabinet"+s);
            else
            System.out.println("Wall Cabinet"+s1);
        }
    }
}
class BedRoom extends Room
{   
    int length,breadth,height;
    boolean BathRoom,StudyTable,NightLamp;
    BedRoom(int length,int breadth,int height,boolean BathRoom,boolean StudyTable,boolean NightLamp)
    {
        super(length,breadth,height);
        this.BathRoom=BathRoom;
        this.StudyTable=StudyTable;
        this.NightLamp=NightLamp;
        super.display(1,new boolean[]{BathRoom,StudyTable,NightLamp});//anonymous arrays
    }
}
class DrawingRoom extends Room
{
    int length,breadth,height;
    boolean sofa,wallCabinet;
    DrawingRoom(int length,int breadth,int height,boolean sofa,boolean wallCabinet)
    {
        super(length,breadth,height);
        this.sofa=sofa;
        this.wallCabinet=wallCabinet;
        super.display(0,new boolean[]{sofa,wallCabinet});//anonymous arrays
    }
}
class Hello
{
    public static void main(String[] args) 
    {
        try
        {
        BedRoom b=new BedRoom(2, 3, 4, true, false, true);
        DrawingRoom d=new DrawingRoom(6, 7, 8, false, true);
        }
        catch(Exception e)
        {
            System.out.println("Exception caught was");
            e.printStackTrace();
        }
    }
}