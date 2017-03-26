package edu.source.it.lectures.lecture7.homeworks;

public class StringReverter {
    public static String revert(String string) {
        if (string == null || string.length() < 2) {
            return string;
        }
        return new StringBuilder(string).reverse().toString();
    }
}
