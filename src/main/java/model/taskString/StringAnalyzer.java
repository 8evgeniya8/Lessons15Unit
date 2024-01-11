package model.taskString;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class StringAnalyzer {

    private static final int SEPARATOR = 0;
    private static final int WORD = 1;
    private String originalString;



    public String reverseString() {
        StringBuilder reverseString = new StringBuilder(originalString);
        return reverseString.reverse().toString();
    }

    public boolean isPalindrome() {
            if (originalString == null) {
                return false;
            }
        String processedS = preprocess(originalString);

        int left = 0;
        int right = processedS.length() - 1;

        while (left < right) {
            if (processedS.charAt(left) != processedS.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    @org.jetbrains.annotations.NotNull
    private static String preprocess(String source) {
        return source.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
    }

    public int countWords() {
        if (originalString == null || originalString.isEmpty()) {
            return 0;
        }
        int flag = SEPARATOR;
        int count = 0;
        int stringLength = originalString.length();
        for (int characterCounter = 0; characterCounter < stringLength; characterCounter++) {
            if (isAllowedInWord(originalString.charAt(characterCounter)) && flag == SEPARATOR) {
                flag = WORD;
                count++;
            } else if (!isAllowedInWord(originalString.charAt(characterCounter))) {
                flag = SEPARATOR;
            }
        }
        return count;
    }

    private static boolean isAllowedInWord(char charAt) {
        return charAt == '\'' || Character.isLetter(charAt);
    }
}
