package edu.source.it.lectures.lecture2.examples;

public class TernarnaryOperator {
    public static void main(String[] args) {
        boolean b = false;
        if (b) {
            System.out.println("b is true");
        } else {
            System.out.println("b is false");
        }

        System.out.println("b is " + b);
        System.out.println("b is " + (b ? "true" : "false"));
    }
}
