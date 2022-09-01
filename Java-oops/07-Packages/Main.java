import Algebra.Complex_numbers;
import Trigonometry.Trigo_calc;
// input-output
// PS C:\Users\akash\Desktop\java-practise\java-lab> javac -d . Main.java
// PS C:\Users\akash\Desktop\java-practise\java-lab> java Main
// Enter real part of 1st Complex number
// 2
// Enter imaginary part of 2nd Complex number
// 3
// Enter real part of 2nd Complex number
// 4
// Enter imaginary part of 2nd Complex number
// 5
// Complex number is 2+i3
// Complex number is 4+i5
// Sum of the 2 complex numbers is
// Complex number is 6+i8
// Difference of the 2 complex numbers is
// Complex number is -2-i2
// sin 60 degree is 0.8660254037844386
// cos 60 degree is 0.5000000000000001
// (sin 60)^2 + (cos 60)^2 is 1.0
// Hence proved
public class Main {
    static void sub_task1_1()
    {
        int real=Complex_numbers.first.r+Complex_numbers.second.r;
        int imaginary=Complex_numbers.first.i+Complex_numbers.second.i;
        System.out.println("Sum of the 2 complex numbers is");
        new Complex_numbers(real, imaginary).display();
    }
    static void sub_task1_2()
    {
        int real=Complex_numbers.first.r-Complex_numbers.second.r;
        int imaginary=Complex_numbers.first.i-Complex_numbers.second.i;
        System.out.println("Difference of the 2 complex numbers is");
        new Complex_numbers(real, imaginary).display();
    }
    static void task1()throws Exception
    {
        Complex_numbers.input();
        Complex_numbers.first.display();
        Complex_numbers.second.display();
        sub_task1_1();
        sub_task1_2();
    }
    static void task2()
    {
        double sin_sixty=Trigo_calc.sin60();
        double cos_sixty=Trigo_calc.cos60();
        Trigo_calc.display_sin();
        Trigo_calc.display_cos();
        double a=Math.pow(sin_sixty,2);
        double b=Math.pow(cos_sixty, 2);
        System.out.println("(sin 60)^2 + (cos 60)^2 is "+(a+b));
        System.out.println("Hence proved");
    }
    public static void main(String[] args)throws Exception
    {
        Main.task1();
        Main.task2();
    }
}
