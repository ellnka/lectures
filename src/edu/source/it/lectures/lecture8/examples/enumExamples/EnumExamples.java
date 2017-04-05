package edu.source.it.lectures.lecture8.examples.enumExamples;

import java.util.Arrays;

import static edu.source.it.lectures.lecture8.examples.enumExamples.CardType.*;

public class EnumExamples {
    public static void main(String[] args) {
        Card master = new Card("4288888111", "123", MASTERCARD);


        /*System.out.println(MASTERCARD == master.getCardType());
        System.out.println(Arrays.toString(CardType.values()));*/
        MASTERCARD.validate("fqsfaf");
        AMEX.validate("fqsfaf");
    }
}
