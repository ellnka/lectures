package edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor;

import edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor.clothes.HeavyClothes;
import edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor.clothes.LightClothes;
import edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor.clothes.MediumClothes;

public class PostageVisitor implements Visitor {
    private int totalPostage;

    @Override
    public void visit(LightClothes clothes) {
        totalPostage += clothes.getWeight();
    }

    @Override
    public void visit(MediumClothes clothes) {
        totalPostage += (2 * clothes.getWeight());
    }

    @Override
    public void visit(HeavyClothes clothes) {
        totalPostage += (4 * clothes.getWeight());
    }

    public int getTotalPostage() {
        return totalPostage;
    }
}
