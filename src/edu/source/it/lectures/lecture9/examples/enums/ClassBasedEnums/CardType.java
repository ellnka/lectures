package edu.source.it.lectures.lecture9.examples.enums.ClassBasedEnums;

public abstract class CardType {
    private static final CardType VISA   = new Visa();
    private static final CardType MASTER = new Master();
    public abstract boolean validate(String cardNumber);

    public static CardType getVisaInstance() {
        return VISA;
    }

    public static CardType getMasterInstance() {
        return MASTER;
    }

    public static class Visa extends CardType {
        private Visa() {}

        @Override
        public boolean validate(String cardNumber) {
            return cardNumber.startsWith("44");
        }
    }

    public static class Master extends CardType {
        private Master() {}

        @Override
        public boolean validate(String cardNumber) {
            return cardNumber.startsWith("48");
        }
    }
}
