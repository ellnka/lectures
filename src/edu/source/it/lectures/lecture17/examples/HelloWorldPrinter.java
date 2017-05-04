package edu.source.it.lectures.lecture17.examples;

public class HelloWorldPrinter {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("Found word " + arg);
        }
        System.out.println("Hello world!");
    }
}
