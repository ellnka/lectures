package edu.source.it.lectures.lecture3.examples;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] oldArray = {5, 4, 3, 2, 1};
        int[] newArray = new int[3];

        System.arraycopy(oldArray, 0, newArray, 0,
                Math.min(newArray.length, oldArray.length));
        //System.arraycopy(newArray, 0, newArray, 5, 5);
        System.out.println(Arrays.toString(newArray));

    }
}
