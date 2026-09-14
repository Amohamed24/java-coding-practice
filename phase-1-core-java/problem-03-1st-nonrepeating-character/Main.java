import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
     * Problem 3: First Non-Repeating Character
     *
     * Given a String, find the first character that appears only once.
     *
     * Example:
     * Input:  "swiss"
     * Output: w
     *
     * If every character repeats, return null.
     *
     */

    public static void main(String []args){

        String word = "swiss";

        Character result = firstNonRepeatingChar(word);

        System.out.println(result);

    }

    public static Character firstNonRepeatingChar (String word) {

        Map<Character, Integer> counts = new HashMap<>();

        // First pass counts each character
        for (int i = 0; i < word.length(); i++) {

            char character = word.charAt(i);

            counts.put(
                    character,
                    counts.getOrDefault(character, 0) + 1
            );
        }

        // Second pass returns character with 1 count
        for (int i = 0; i < word.length(); i++) {

            char character = word.charAt(i);

            if(counts.get(character) == 1) {
                return character;
            }
        }

        return null;
    }
}
