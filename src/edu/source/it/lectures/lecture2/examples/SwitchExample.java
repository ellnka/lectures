package edu.source.it.lectures.lecture2.examples;

public class SwitchExample {
    public static void main(String[] args) {
        int x = 7;
        switch (x) {
            case 0:
                System.out.println("false");
                break;
            case 1:
                System.out.println("true");
                break;
            case 2:
                System.out.println("I don't know");
                break;
            default:
                System.out.printf("Smth wrong");
        }
    }
}
