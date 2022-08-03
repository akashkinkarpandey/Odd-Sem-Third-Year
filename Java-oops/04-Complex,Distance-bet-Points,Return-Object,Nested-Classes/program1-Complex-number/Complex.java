import java.util.*;
// Qs->
// Create a class Complex for storing real and imaginary parts of Complex Number
// The class should have static members to store number of complex numbers created and display it
// Write static or non static method as required to calculate:-
// 1 The sum difference and product of 2 complex numbers
// 2 Modulus and complement of Complex Number
// Define required constructors of the class

//input-output
// Press 1 to continue or any other number to exit
// 1
// Number of complex numbers operated upon till now is 0
// Enter real and imaginary part of 1st complex number
// 3 4
// Enter real and imaginary part of 2nd complex number
// 4 3
// Sum of 3+i4 and 4+i3 is 7+i7
// Subtraction of 3+i4 and 4+i3 is -1+i1
// Product of 3+i4 and 4+i3 is 0+i25
// Modulus of 3+i4 is 5.0
// Modulus of 4+i3 is 5.0
// Complement of 3+i4 is 3-i4
// Complement of 4+i3 is 4-i3
// Press 1 to continue or any other number to exit
// 1
// Number of complex numbers operated upon till now is 2
// Enter real and imaginary part of 1st complex number
// 5 0
// Enter real and imaginary part of 2nd complex number
// 0 5
// Sum of 5+i0 and 0+i5 is 5+i5
// Subtraction of 5+i0 and 0+i5 is 5+i-5
// Product of 5+i0 and 0+i5 is 0+i25
// Modulus of 5+i0 is 5.0
// Modulus of 0+i5 is 5.0
// Complement of 5+i0 is 5-i0
// Complement of 0+i5 is 0-i5
// Press 1 to continue or any other number to exit
// 1
// Number of complex numbers operated upon till now is 4
// Enter real and imaginary part of 1st complex number
// 3 3
// Enter real and imaginary part of 2nd complex number
// 6 6
// Sum of 3+i3 and 6+i6 is 9+i9
// Subtraction of 3+i3 and 6+i6 is -3+i-3
// Product of 3+i3 and 6+i6 is 0+i36
// Modulus of 3+i3 is 4.242640687119285
// Modulus of 6+i6 is 8.48528137423857
// Complement of 3+i3 is 3-i3
// Complement of 6+i6 is 6-i6
// Press 1 to continue or any other number to exit
// 0
// Number of complex numbers operated upon till now is 6
class Complex {
    int r, i;
    static int c = 0;

    Complex() {
    }

    Complex(int real, int imaginary) {
        r = real;
        i = imaginary;
        c++;
    }

    Complex add(Complex c2) {
        Complex t = new Complex();
        t.r = this.r + c2.r;
        t.i = this.i + c2.i;
        return t;
    }

    Complex subtract(Complex c2) {
        Complex t = new Complex();
        t.r = this.r - c2.r;
        t.i = this.i - c2.i;
        return t;
    }

    Complex product(Complex c2) {
        Complex t = new Complex();
        t.r = this.r * c2.r - this.i * c2.i;
        t.i = this.r * c2.i + this.i * c2.r;
        return t;
    }

    double modulus() {
        double ans = Math.sqrt(this.r * this.r + this.i * this.i);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Press 1 to continue or any other number to exit");
                int choice = sc.nextInt();
                System.out.println("Number of complex numbers operated upon till now is " + c);
                if (choice != 1) {
                    break;
                }
                System.out.println("Enter real and imaginary part of 1st complex number ");
                int real1 = sc.nextInt();
                int imaginary1 = sc.nextInt();
                Complex c1 = new Complex(real1, imaginary1);
                System.out.println("Enter real and imaginary part of 2nd complex number ");
                int real2 = sc.nextInt();
                int imaginary2 = sc.nextInt();
                Complex c2 = new Complex(real2, imaginary2);
                Complex temp = c1.add(c2);
                Complex temp1 = c1.subtract(c2);
                Complex temp2 = c1.product(c2);
                double temp3 = c1.modulus();
                double temp4 = c2.modulus();
                System.out.println("Sum of " + real1 + "+i" + imaginary1 + " and " + real2 + "+i" + imaginary2 + " is "
                        + temp.r + "+i" + temp.i);
                System.out.println("Subtraction of " + real1 + "+i" + imaginary1 + " and " + real2 + "+i" + imaginary2
                        + " is " + temp1.r + "+i" + temp1.i);
                System.out.println("Product of " + real1 + "+i" + imaginary1 + " and " + real2 + "+i" + imaginary2
                        + " is " + temp2.r + "+i" + temp2.i);
                System.out.println("Modulus of " + real1 + "+i" + imaginary1 + " is " + temp3);
                System.out.println("Modulus of " + real2 + "+i" + imaginary2 + " is " + temp4);
                System.out.println("Complement of " + real1 + "+i" + imaginary1 + " is " + real1 + "-i" + imaginary1);
                System.out.println("Complement of " + real2 + "+i" + imaginary2 + " is " + real2 + "-i" + imaginary2);

            }
        } catch (Exception e) {
            System.out.println("Exception thrown was:-");
            e.printStackTrace();
        }
        sc.close();
    }
}