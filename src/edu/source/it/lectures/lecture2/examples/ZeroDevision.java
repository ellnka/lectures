package edu.source.it.lectures.lecture2.examples;

public class ZeroDevision {
    public static void main(String[] args) {
        //int x = 1;
        //System.out.println(x / 0);

        float f = -1.0f;
        System.out.println(0f / 0f);

        double d = 1.0, x = -1.0;
        System.out.println((d / 0) / (x / 0));

    }
}
