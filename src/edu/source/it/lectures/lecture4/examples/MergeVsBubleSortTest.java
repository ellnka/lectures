package edu.source.it.lectures.lecture4.examples;

import edu.source.it.lectures.lecture3.examples.BubbleSortExample;
import edu.source.it.lectures.lecture4.homework.sort.ArrayCreator;

public class MergeVsBubleSortTest {
    public static void main(String[] args) {
        int[] hugeArrayForBubble = ArrayCreator.createHugeArray(10000);
        int[] hugeArrayForMerge = new int[hugeArrayForBubble.length];
        System.arraycopy(hugeArrayForBubble, 0, hugeArrayForMerge, 0, hugeArrayForBubble.length);

        long startBubble = System.currentTimeMillis();
        BubbleSortExample.bubbleSort(hugeArrayForBubble);
        long endBubble = System.currentTimeMillis();

        long startMerge = System.currentTimeMillis();
        ArrayMergeSorter.mergeSort(hugeArrayForMerge);
        long endMerge = System.currentTimeMillis();

        System.out.println("Merge took " + (endMerge - startMerge) + " ms");
        System.out.println("Bubble took " + (endBubble - startBubble) + " ms");
    }

}
