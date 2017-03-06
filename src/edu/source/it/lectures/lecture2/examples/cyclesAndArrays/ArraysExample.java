package edu.source.it.lectures.lecture2.examples.cyclesAndArrays;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 2;
        System.out.println(array[0]);
        System.out.println(array[2]);

        /*int[] newArray = new int[8];
        newArray[0] = array[0];

        if (newArray.length >= array.length) {
            for (int index = 0; index < array.length; index++) {
                newArray[index] = array[index];
            }
        }

        for (int index = 0; index < Math.min(array.length, newArray.length); index++) {
            newArray[index] = array[index];
        }*/
        //ToDo: remove last comma
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + ", ");
        }
        System.out.println();
        for (int elem : array) {
            System.out.print(elem + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));

        for(;;) {
            break;
        }

    }

    public int doSmth(int x1, int x2, float f) {
        return 1;
    }
}
