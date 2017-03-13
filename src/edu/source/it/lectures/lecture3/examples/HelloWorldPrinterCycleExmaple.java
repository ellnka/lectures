package edu.source.it.lectures.lecture3.examples;

public class HelloWorldPrinterCycleExmaple {
    private static final String HELLO_STRING = "Hello World";
    private static final int PRINT_QUANTITY = 3;
    public static void main(String[] args) {
        for (int x = 0; x < PRINT_QUANTITY; ++x) {
            System.out.println(HELLO_STRING);
        }

        System.out.println("________________");
        int x = 0;
        while (x < PRINT_QUANTITY) {
            System.out.println(HELLO_STRING);
            x++;
        }
        x = 0;
        System.out.println("________________");

        do {
            System.out.println(HELLO_STRING);
            x++;
        } while (x < PRINT_QUANTITY);

        System.out.println("________________");

        String[] array = {HELLO_STRING, HELLO_STRING, HELLO_STRING};
        for (String s : array) {
            System.out.println(s);
        }
    }
}
