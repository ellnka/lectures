package edu.source.it.lectures.lecture7.examples.iterable;


public class MyIterableExample {
    public static void main(String[] args) {
        IterableNode head = new IterableNode(5);
        head.setNext(new IterableNode(6));
        head.getNext().setNext(new IterableNode(12));

        for (IterableNode node : head) {
            System.out.print(node.getValue() + "-->");
        }
    }
}
