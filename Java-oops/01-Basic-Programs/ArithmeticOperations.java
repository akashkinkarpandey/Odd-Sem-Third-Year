//Qs->take input of 2 numbers
//then add,subtract and multiply them

//Output:-
// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> javac ArithmeticOperations.java
// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> java ArithmeticOperations 5 7

// Sum is 12
// Difference is -2
// Product is 35
class ArithmeticOperations
{
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("Sum is "+(a+b));
        System.out.println("Difference is "+(a-b));
        System.out.println("Product is "+(a*b));
    }
}