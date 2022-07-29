import java.util.*;
class Complex
{
    int r,i;
    static int c=0;
    Complex()
    {}
    Complex(int real,int imaginary)
    {
        r=real;
        i=imaginary;
        c++;
    }
    Complex add(Complex c2)
    {
        Complex t=new Complex();
        t.r=this.r+c2.r;
        t.i=this.i+c2.i;
        return t;
    }
    Complex subtract(Complex c2)
    {
        Complex t=new Complex();
        t.r=this.r-c2.r;
        t.i=this.i-c2.i;
        return t;
    }
    Complex product(Complex c2)
    {
        Complex t=new Complex();
        t.r=this.r*c2.r-this.i*c2.i;
        t.i=this.r*c2.i+this.i*c2.r;
        return t;
    }
    double modulus()
    {
        double ans=Math.sqrt(this.r*this.r+this.i*this.i);
        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Press 0 to exit.. 1 to continue ");
            int choice=sc.nextInt();
            if(choice==0)
            {
            break;
            }
            else if(choice!=1)
            {
            System.out.println("Wrong choice..Enter again");
            continue;
            }
            else
            {
                System.out.println("Number of complex numbers operated on till now is "+c);
            }
            System.out.println("Enter real and imaginary part of 1st complex number ");
            int real1=sc.nextInt();
            int imaginary1=sc.nextInt();
            Complex c1=new Complex(real1,imaginary1);
            System.out.println("Enter real and imaginary part of 2nd complex number ");
            int real2=sc.nextInt();
            int imaginary2=sc.nextInt();
            Complex c2=new Complex(real2,imaginary2);
            Complex temp=c1.add(c2);
            Complex temp1=c1.subtract(c2);
            Complex temp2=c1.product(c2);
            double temp3=c1.modulus();
            double temp4=c2.modulus();
            System.out.println("Sum of "+real1+"+i"+imaginary1+" and "+real2+"+i"+imaginary2+" is "+temp.r+"+i"+temp.i);
            System.out.println("Subtraction of "+real1+"+i"+imaginary1+" and "+real2+"+i"+imaginary2+" is "+temp1.r+"+i"+temp1.i);
            System.out.println("Product of "+real1+"+i"+imaginary1+" and "+real2+"+i"+imaginary2+" is "+temp2.r+"+i"+temp2.i);
            System.out.println("Modulus of "+real1+"+i"+imaginary1+" is "+temp3);
            System.out.println("Modulus of "+real2+"+i"+imaginary2+" is "+temp4);
            System.out.println("Compliment of "+real1+"+i"+imaginary1+" is "+real1+"-i"+imaginary1);
            System.out.println("Compliment of "+real2+"+i"+imaginary2+" is "+real2+"-i"+imaginary2);

        }
        sc.close();

    }
}