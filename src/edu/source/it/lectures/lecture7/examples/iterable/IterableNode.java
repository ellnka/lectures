package edu.source.it.lectures.lecture7.examples.iterable;

import edu.source.it.lectures.lecture4.examples.queue.Node;

import java.util.Iterator;

public class IterableNode extends Node implements Iterable<IterableNode> {

    public IterableNode(int value) {
        super(value);
    }

    @Override
    public IterableNode getNext() {
        return (IterableNode)next;
    }

    @Override
    public Iterator iterator() {
        return new NodeIterator();
    }

    private class NodeIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return getNext() != null;
        }

        @Override
        public IterableNode next() {
            return getNext();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
