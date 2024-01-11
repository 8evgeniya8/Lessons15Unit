package model.taskString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringAnalyzerTest {

    private StringAnalyzer analyzer;

    @BeforeEach
    void init(){
        analyzer = new StringAnalyzer();
    }

    @Test
    @DisplayName("Тестування reverseString звичайного рядка")
    void testReverseStringWithNormalString(){

        analyzer.setOriginalString("я несу гусеня");

        assertEquals("янесуг усен я", analyzer.reverseString());
    }

    @Test
    @DisplayName("Тестування reverseString пустого рядка")
    void testReverseStringWithEmtyString(){

        analyzer.setOriginalString("");

        assertEquals("", analyzer.reverseString());
    }

    @Test
    @DisplayName("Тестування reverseString рядка з однією літерою")
    void testReverseStringWithSingleCharacter(){

        analyzer.setOriginalString("а");

        assertEquals("а", analyzer.reverseString());
    }

    @Test
    @DisplayName("Тестування reverseString з рядком, " +
            "що містить пробіли та спеціальні символи.")
    void testReverseStringWithSpecialCharacters(){

        analyzer.setOriginalString("я несу гусеня 1№-4!?");

        assertEquals("?!4-№1 янесуг усен я", analyzer.reverseString());
    }


    @Test
    @DisplayName("Тестування isPalindrome з паліндромом " +
            "- перевірка рядка, який є паліндромом.")
    void testIsPalindromeWithPalindrome(){

        analyzer.setOriginalString("кит на морі романтик");

        assertTrue(analyzer.isPalindrome());
    }

    @Test
    @DisplayName("Тестування isPalindrome з не-паліндромом " +
            "- перевірка рядка, який не є паліндромом.")
    void testIsPalindromeWithNonPalindrome(){

        analyzer.setOriginalString("романтик");

        assertFalse(analyzer.isPalindrome());
    }

    @Test
    @DisplayName("Тестування isPalindrome з пустим рядком " +
            "- перевірка поведінки методу з пустим рядком.")
    void testIsPalindromeWithEmptyString(){

        analyzer.setOriginalString("");

        assertTrue(analyzer.isPalindrome());
    }

    @Test
    @DisplayName("Тестування isPalindrome з рядком, що містить " +
            "лише спеціальні символи і пробіли.")
    void testIsPalindromeWithSpecialCharacters(){

        analyzer.setOriginalString("!-!'! ?_??");

        assertTrue(analyzer.isPalindrome());
    }

    @Test
    @DisplayName("Тестування isPalindrome з рядком, що містить " +
            "лише спеціальні символи і пробіли.")
    void testIsPalindromeWithNull(){

        analyzer.setOriginalString(null);

        assertFalse(analyzer.isPalindrome());
    }


    @Test
    @DisplayName("Тестування countWords з пустим рядком")
    void testCountWordsWithEmptyString(){

        analyzer.setOriginalString("");

        assertEquals(0,analyzer.countWords());
    }

    @Test
    @DisplayName("Тестування countWords з рядком, що містить кілька слів")
    void testCountWordsWithFewWord(){

        analyzer.setOriginalString("Дзеркальні слова");

        assertEquals(2,analyzer.countWords());
    }

    @Test
    @DisplayName("Тестування countWords з рядком, що містить одне слово")
    public void testCountWordsWithOneWord() {

        analyzer.setOriginalString("Дзеркало");

        assertEquals(1, analyzer.countWords());
    }

    @Test
    @DisplayName("Тестування countWords з рядком, що містить спеціальні символи та пробіли")
    public void testCountWordsWithSpecialCharacters() {

        analyzer.setOriginalString("І 'розморозь! зором? зорі !");

        assertEquals(4, analyzer.countWords());
    }

    @Test
    @DisplayName("Тестування countWords з null")
    public void testCountWordsWithNull() {

        analyzer.setOriginalString(null);

        assertEquals(0, analyzer.countWords());
    }

}