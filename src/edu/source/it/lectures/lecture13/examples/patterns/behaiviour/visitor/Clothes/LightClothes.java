package edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor.clothes;

import edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor.Visitable;
import edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor.Visitor;

public class LightClothes implements Visitable  {
    private int weight;
    //...some other fields

    public LightClothes(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
