package edu.source.it.lectures.lecture2.examples;

public class ConditionsExamples {
    public static void main(String[] args) {
        boolean b = false;
        boolean bb = false;
        if (b && bb) {
            int x = 0;
            System.out.println("b is true");
        } else if (bb) {
            System.out.println("b is false but bb is true");
        } else {
            System.out.println("b and bb are false");
        }
        int x = 1;
        System.out.print(x);
    }
}
