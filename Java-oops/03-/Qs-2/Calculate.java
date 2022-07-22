class Box
{
int l,b,h;
Box(int l,int b,int h)
{
this.l=l;
this.b=b;
this.h=h;
}
Box(int l)
{
this.l=l;
this.b=l;
this.h=l;
}
double volume()
{
return l*b*h;
}
}
class Calculate
{
public static void main(String args[])
{
Box one=new Box(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
Box two=new Box(Integer.parseInt(args[3]));
System.out.println("1st->Volume of cuboid is "+one.volume());
System.out.println("2nd->Volume of cube is "+two.volume());
}
}