import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    /*
     * Problem 1: Word Frequency Counter
     *
     * Given a List<String>, count how many times each word appears.
     *
     * Example:
     * Input:  [java, python, java, javascript, java, python]
     * Output: {java=3, python=2, javascript=1}
     *
     */

    public static void main (String[] args){

        List<String> words = List.of(
                "java",
                "python",
                "java",
                "javascript",
                "java",
                "python"
        );

        Map<String, Integer> result = countWords(words);

        System.out.println(result);
    }

    public static Map<String, Integer> countWords(List<String> words) {

        HashMap<String, Integer> hash = new HashMap<>();

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);

            if(!hash.containsKey(word)) {
                hash.put(word, 1);
            } else {
                hash.put(word, hash.get(word)+1);
            }
        }

        return hash;
    }
}
