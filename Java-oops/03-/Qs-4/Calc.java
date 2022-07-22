class Hello
{
int a;
Hello()
{
System.out.println("Non parameterized constructor called ");
}
Hello(int a)
{
System.out.println("Parameterized constructor called "+a);
}
void f()
{
System.out.println("First function called");
}
void f(int d)
{
System.out.println("Second function called "+d+"");
}
void f(double a)
{
System.out.println("Second function called "+a+"");
}
}
class Calc
{
public static void main(String args[])
{
Hello a=new Hello();
Hello b=new Hello(Integer.parseInt(args[0]));
b.f();
b.f(Integer.parseInt(args[1]));
b.f(Double.parseDouble(args[2]));
}
}