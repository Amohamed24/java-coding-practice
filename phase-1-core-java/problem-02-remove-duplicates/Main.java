import java.util.*;

public class Main {

    /*
     * Problem 2: Remove Duplicates While Preserving Order
     *
     * Given a List<String>, remove duplicate values while preserving
     * the order of their first appearance.
     *
     * Example:
     * Input:  [java, python, java, javascript, python, java]
     * Output: [java, python, javascript]
     *
     */

    public static void main(String[] args) {

        List<String> words = List.of(
                "java",
                "python",
                "java",
                "javascript",
                "python",
                "java"
        );

        List<String> result = getRidOfDuplicates(words);

        System.out.println(result);
    }

    public static List<String> getRidOfDuplicates(List<String> words) {

        Set<String> seen = new HashSet<>();

        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (seen.add(word)) {
                result.add(word);
            }
        }

        return result;
    }
}
