package edu.source.it.lectures.lecture3.examples.userExample;

public class PrimitiveVariableMethodCall {
    public static void main(String[] args) {
        int a = 5;
        a = doSmth(a);
        System.out.println(a);
    }

    static int doSmth(int b) {
        return ++b;
    }
}
