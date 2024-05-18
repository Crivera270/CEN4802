
import java.io.*;
import java.util.Scanner;

public class Fibonacci {
  
    static int Fib(int n)
    {

        if (n == 0 || n == 1)
            return n;

        return Fib(n- 1) + Fib(n - 2);

    }
    public static void main (String[] args) {

        System.out.println("Fibonacci Sequence:");
        System.out.println("Please enter value below");

        Scanner value = new Scanner(System.in);
        int number = value.nextInt();

        System.out.println("You entered: "+ number);

        System.out.println("Processing...");
        System.out.println("Fibonacci of "+number+" is: "+Fib(number));


    }



}
