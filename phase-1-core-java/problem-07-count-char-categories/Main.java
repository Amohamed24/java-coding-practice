import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
     * Problem 7: Count Character Categories
     *
     * Given a String, count how many characters are
     * letters, digits, spaces, and other characters.
     *
     * Example:
     * Input:  "Hello World 123"
     * Output: {Letters=10, Digits=3, Spaces=2, OtherChars=0}
     *
     */

    public static void main(String []args){

        String sample = "Hello World 123";

        Map<String, Integer> result = countCharCategories(sample);

        System.out.println(result);
    }

    public static Map<String, Integer> countCharCategories(String sample) {

        Map<String, Integer> count = new HashMap<>();

        int letters = 0;
        int digits = 0;
        int spaces = 0;
        int otherChars = 0;

        for (int i = 0; i < sample.length(); i++) {

            char character = sample.charAt(i);

            if (Character.isLetter(character)) {
                letters++;
            } else if (Character.isDigit(character)) {
                digits++;
            } else if (Character.isSpaceChar(character)) {
                spaces++;
            } else {
                otherChars++;
            }
        }

        count.put("Letters", letters);
        count.put("Digits", digits);
        count.put("Spaces", spaces);
        count.put("OtherChars", otherChars);

        return count;
    }}
