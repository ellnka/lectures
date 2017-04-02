package edu.source.it.lectures.lecture9.examples.enums.ClassBasedEnums;

public class CardTypeExample {
    public static void main(String[] args) {
        //CardType visa = new CardType.Visa();
        CardType visa = CardType.getVisaInstance();
        CardType master = CardType.getMasterInstance();
        //CardType master = new CardType.Master();
        //CardType cardType = new CardType();
        System.out.println(visa.validate("484444"));
        System.out.println(visa.validate("444444"));
        //CardType anotherVisa = new CardType.Visa();
        CardType anotherVisa = CardType.getVisaInstance();

        System.out.println(visa == anotherVisa);
    }
}
