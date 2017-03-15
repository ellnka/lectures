package edu.source.it.lectures.lecture4.examples;

public class FactorialExample {
    public static void main(String[] args) {
        int x = factorial(6);
        System.out.println("Factorial = " + x);

        int result = 1;
        for (int i = 1; i <= 6; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Illegal argument");
            return 0;
        }
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
           return 1;
        }
    }
}
