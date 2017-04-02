package edu.source.it.lectures.lecture9.examples.enums;

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
    }/*,
    NONE {
        @Override
        public boolean validate(String cardNumber) {
            return false;
        }
    }*/;

    public abstract boolean validate(String cardNumber);

    public static CardType calculateCardTypeFromCardNumber(String cardNumber) {
        for (CardType cardType : CardType.values()) {
            if (cardType.validate(cardNumber)) {
                return cardType;
            }
        }
        //return NONE;
        throw new IllegalArgumentException("Card type was not found for card = "
                + cardNumber);
    }
}
