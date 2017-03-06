package edu.source.it.lectures.lecture2.examples;

public class SwitchStringExample {
    public static void main(String[] args) {
        String s = "BA";
        switch (s) {
            case "Ab" :
                System.out.println("true");
                break;
            case "Ba" :
                System.out.println("false");
                break;
            default :
                System.out.println("Smth wrong");
        }
    }
}
