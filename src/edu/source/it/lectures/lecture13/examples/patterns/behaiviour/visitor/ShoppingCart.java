package edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Visitable> items = new ArrayList<>();

    public void addItem(Visitable item) {
        items.add(item);
    }

    public int calculatePostagePrice() {
        PostageVisitor visitor = new PostageVisitor();
        for (Visitable item : items) {
            item.accept(visitor);
        }

        return visitor.getTotalPostage();
    }
}
