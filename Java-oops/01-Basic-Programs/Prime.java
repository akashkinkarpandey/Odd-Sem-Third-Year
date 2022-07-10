// Qs-check if a number is prime or not

// output
// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> javac Prime.java
// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> java Prime 9
// 9 is Not Prime
// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> java Prime 5
// 5 is Prime
// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> java Prime 1
// 1 is Not Prime
// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> java Prime 13
// 13 is Prime
public class Prime {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int c=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            c++;
        }
        if(c==2)
        System.out.println(a+" is Prime");
        else System.out.println(a+" is Not Prime");
    }
}
