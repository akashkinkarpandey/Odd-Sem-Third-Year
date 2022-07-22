class Box
{
int l,b,h;
Box()
{
	
}
Box(int l,int b,int h)
{
	this.l=l;
	this.b=b;
	this.h=h;
}
void display()
{
System.out.println("l "+l+" b "+b+" h "+h);
}
}
class Demo
{
public static void main(String args[])
{
	Box one=new Box(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	Box two=new Box();
	two.l=Integer.parseInt(args[3]);
	two.b=Integer.parseInt(args[4]);
	two.h=Integer.parseInt(args[5]);
	one.display();
	two.display();
}
}