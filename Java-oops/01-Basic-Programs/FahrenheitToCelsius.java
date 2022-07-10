//qs->take input in fahrenheit
//print the corresponding celsius

//output

// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> javac FahrenheitToCelsius.java
// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> java FahrenheitToCelsius 32
// Temperature in Celsius is 0.0
// PS D:\Odd-Sem-Third-Year\Java-oops\01-Basic-Programs> java FahrenheitToCelsius -40
// Temperature in Celsius is -40.0
public class FahrenheitToCelsius {
    public static void main(String[] args) {
     double F=Double.parseDouble(args[0]);
     double C=(5*(F-32))/9;
     System.out.println("Temperature in Celsius is "+C);
    }
}
