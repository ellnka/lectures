package edu.source.it.lectures.lecture2.examples;

public class BooleanOperands {
    public static void main(String[] args) {
        boolean b = true;
        boolean bb = false;
        /*System.out.println(b ^ bb);

        System.out.println(!b);*/

    /*    System.out.println(bb ^ b);
        System.out.println(bb != b);
*/
        System.out.println(true ^ (false & false));
        System.out.println(true != false & false);


    }
}
