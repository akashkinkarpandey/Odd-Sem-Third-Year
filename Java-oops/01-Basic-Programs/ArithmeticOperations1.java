//Qs->take input of 2 numbers
//then add,subtract and multiply them

//output:-
// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> javac ArithmeticOperations1.java

// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> java ArithmeticOperations1

// Enter 1st number
// 8
// Enter 2nd number
// 9
// Sum is 17
// Difference is -1
// Product is 72
import java.util.*;
class ArithmeticOperations1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Sum is "+(a+b));
        System.out.println("Difference is "+(a-b));
        System.out.println("Product is "+(a*b));
        sc.close();
    }
}