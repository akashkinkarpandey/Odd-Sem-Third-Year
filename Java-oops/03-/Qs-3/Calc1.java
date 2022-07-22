class Box
{
int a;int b;int c;
Box(int a,int b,int c)
{this.a=a;this.b=b;this.c=c;}
Box(Box box)
{
this.a=box.a;
this.b=box.b;
this.c=box.c;
}
boolean check(Box b2)
{
return ((this.a==b2.a) && (this.b==b2.b) && (this.c==b2.c));
}
}
class Calc1
{
public static void main(String args[])
{
Box one=new Box(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
Box two=new Box(one);
two.a=Integer.parseInt(args[3]);
two.b=Integer.parseInt(args[4]);
two.c=Integer.parseInt(args[5]);
if(one.check(two))
{
System.out.println("Boxes have same dimension");
}
else
{System.out.println("Boxes have different dimension");}
}
}