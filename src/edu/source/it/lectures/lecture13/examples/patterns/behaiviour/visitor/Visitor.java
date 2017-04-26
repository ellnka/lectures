package edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor;

import edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor.clothes.HeavyClothes;
import edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor.clothes.LightClothes;
import edu.source.it.lectures.lecture13.examples.patterns.behaiviour.visitor.clothes.MediumClothes;

public interface Visitor {
    void visit(LightClothes clothes);
    void visit(MediumClothes clothes);
    void visit(HeavyClothes clothes);
}
