package edu.source.it.lectures.lecture8.examples.enumExamples;

public enum CardType {
    VISA {
        @Override
        public boolean validate(String cardNumber) {
            return cardNumber.startsWith("44");
        }
    },

    MASTERCARD {
        @Override
        public boolean validate(String cardNumber) {
            return cardNumber.startsWith("48");
        }
    },

    AMEX {
        @Override
        public boolean validate(String cardNumber) {
            return cardNumber.startsWith("22");
        }
    };


    public abstract boolean validate(String cardNumber);
}
