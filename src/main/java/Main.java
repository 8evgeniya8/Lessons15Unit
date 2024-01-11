import model.taskString.StringAnalyzer;

public class Main {
    public static void main(String[] args) {
        StringAnalyzer stringAnalyzer = new StringAnalyzer();

        String text = "кит на морі романтик";

        stringAnalyzer.setOriginalString(text);

        String reversed = stringAnalyzer.reverseString();
        boolean isPalindrome = stringAnalyzer.isPalindrome();
        int wordCount = stringAnalyzer.countWords();

        System.out.println("Original sentence: " + text);
        System.out.println("Reversed sentence: " + reversed);
        System.out.println("Is palindrome: " + isPalindrome);
        System.out.println("Word count: " + wordCount);

    }
}
