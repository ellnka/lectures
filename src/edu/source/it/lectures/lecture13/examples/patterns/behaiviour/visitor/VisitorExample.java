package edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor;

import edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor.clothes.HeavyClothes;
import edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor.clothes.LightClothes;
import edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor.clothes.MediumClothes;

public class VisitorExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new LightClothes(200));
        cart.addItem(new LightClothes(300));

        cart.addItem(new MediumClothes(600));

        cart.addItem(new HeavyClothes(1100));

        System.out.println(cart.calculatePostagePrice());
    }
}
