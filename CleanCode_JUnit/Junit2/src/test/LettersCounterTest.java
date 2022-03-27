package test;

import main.LettersCounter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LettersCounterTest {

    private LettersCounter lettersCounter;

@BeforeEach
    public void initCounter() {
    lettersCounter = new LettersCounter();
}

@Test
    public void shouldThrowIllegalArgumentExcepption_when_text_is_null() {
    char character = 'd';
    String text = null;
    String expected = String.format("Method input parameter character was = %s and text was text %s", character, text);

    Throwable actual = assertThrows(IllegalArgumentException.class, () -> {lettersCounter.countCharacter(character, text);});
    assertEquals(expected, actual.getMessage());
}
    @Test
    public void shouldThrowIllegalArgumentExcepption_when_character_is_empty() {
        char character = ' ';
        String text = "text";
        String expected = String.format("Method input parameter character was = %s and text was text %s", character, text);

        Throwable actual = assertThrows(IllegalArgumentException.class, () -> {lettersCounter.countCharacter(character, text);});
        assertEquals(expected, actual.getMessage());
    }
    @Test
    public void shouldCalculate_1_when_text_has_1_given_character() {
        char character = 'd';
        String text = "dictionary";

        assertEquals(1, lettersCounter.countCharacter(character, text));
    }
}
