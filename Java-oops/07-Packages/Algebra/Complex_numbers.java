package Algebra;
import java.io.*;
public class Complex_numbers {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static Complex_numbers first,second;//objects of Complex_Numbers class
    public int r,i;
    public Complex_numbers(int r,int i)
    {
        this.r=r;
        this.i=i;
    }
    public static void input()throws IOException
    {
        try{
        System.out.println("Enter real part of 1st Complex number");
        int r1=Integer.parseInt(br.readLine());
        System.out.println("Enter imaginary part of 2nd Complex number");
        int i1=Integer.parseInt(br.readLine());
        first=new Complex_numbers(r1, i1);
        System.out.println("Enter real part of 2nd Complex number");
        int r2=Integer.parseInt(br.readLine());
        System.out.println("Enter imaginary part of 2nd Complex number");
        int i2=Integer.parseInt(br.readLine());
        second=new Complex_numbers(r2, i2);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void display()
    {
        if(this.i>=0)
        System.out.println("Complex number is "+r+"+i"+i);
        else
        System.out.println("Complex number is "+r+"-i"+(-i));
    }
}
