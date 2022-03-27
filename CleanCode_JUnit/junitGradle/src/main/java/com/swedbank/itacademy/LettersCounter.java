package com.swedbank.itacademy;

public class LettersCounter {

    public int countCharacter(char character, String text) throws IllegalArgumentException {
        if (character == ' ' || text == null) {
            throw new IllegalArgumentException(String.format("Method input parameter character was = %s and text was text %s", character, text));
        }

        int counter = 0;
        for (int i= 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }
}
