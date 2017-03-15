package edu.source.it.lectures.lecture4.examples;

import javax.xml.bind.SchemaOutputResolver;

public class RecursionExample {
    public static void main(String[] args) {
        repeatingPrinter(5);
        /*recursionMethod();*/
    }

    /*public static void recursionMethod() {
        System.out.println("Before recursion");
        recursionMethod();
        System.out.println("After recursion");
    }*/

    private static void repeatingPrinter(int count) {
        System.out.println("Hello " + count);
        if (count > 1) {
            repeatingPrinter(count - 1);
        }
        System.out.println("bye - bye " + count);
    }
}
