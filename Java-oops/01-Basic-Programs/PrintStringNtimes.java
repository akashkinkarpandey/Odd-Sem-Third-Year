//qs->Accept a number N,string S from user
//print string S, N number of times

//output
// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> javac PrintStringNtimes.java

// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> java PrintStringNtimes 5 helloWORLD
// String is helloWORLD
// String is helloWORLD
// String is helloWORLD
// String is helloWORLD
// String is helloWORLD
public class PrintStringNtimes {
    public static void main(String[] args) {
        int N=Integer.parseInt(args[0]);
        String s=args[1];
        for(int i=1;i<=N;i++)
        System.out.println("String is "+s);

    }
}
