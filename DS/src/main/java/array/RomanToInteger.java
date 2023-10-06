package array;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanLetter = "MCMXCIV"; // 1994
//        String romanLetter = "MCMIV"; // 1904
//        String romanLetter = "LVIII"; // 58
        int length = romanLetter.length();
        int totalCount = 0;
        for (int i = 0; i < length; i++) {
            int intValueOfCurrentChar = findIntegerForRomanChar(romanLetter.charAt(i));
            if (i + 1 < length) {
                int intValueOfNextChar = findIntegerForRomanChar(romanLetter.charAt(i + 1));
                if (intValueOfCurrentChar < intValueOfNextChar) {
                    totalCount += intValueOfNextChar - intValueOfCurrentChar;
                    i++;
                } else {
                    totalCount += intValueOfCurrentChar;
                }
            } else {
                totalCount += intValueOfCurrentChar;
            }
        }
        System.out.println(totalCount);
    }


    private static int findIntegerForRomanChar(Character c) {
        if (c.equals('I'))
            return 1;
        if (c.equals('V'))
            return 5;
        if (c.equals('X'))
            return 10;
        if (c.equals('L'))
            return 50;
        if (c.equals('C'))
            return 100;
        if (c.equals('D'))
            return 500;
        if (c.equals('M'))
            return 1000;
        else
            return 0;
    }
}
