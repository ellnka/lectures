package edu.source.it.lectures.lecture9.examples.enums;

public class CardTypeEnumExample {
    public static void main(String[] args) {
        //CardType cardType = CardType.calculateCardTypeFromCardNumber("2728");
        CardType cardType = CardType.calculateCardTypeFromCardNumber("2228");
        System.out.println(cardType);
    }
}
