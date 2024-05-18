
import java.io.*;
import java.util.Scanner;

public class Fibonacci {
    /**
     * Christina Rivera 05/18/2024
     * Fibonacci
     * This class contains the methods to create an application that outputs
     * the Fibonacci number of an input.
     */

    static int Fib(int n) {
        /**
         * Fib
         * This method contains the formula used to obtain the Fibonacci number
         * of an input
         * @param the inputed integer
         * @return the fibonacci number of the input
         */


        if (n == 0 || n == 1)
            return n;

        return Fib(n - 1) + Fib(n - 2);

    }

    public static void main(String[] args) {
        /**
        * main
        * This method contains the application the user will interact with to input
        * an integer and get the fibonacci number in return.
        */

        System.out.println("Fibonacci Sequence:");
        System.out.println("Please enter value below");

        Scanner value = new Scanner(System.in);
        int number = value.nextInt();

        System.out.println("You entered: " + number);

        System.out.println("Processing...");
        System.out.println("Fibonacci of " + number + " is: " + Fib(number));


    }


}
