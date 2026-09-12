import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    /*
     * Problem 4: Find Common Elements Between Two Lists
     *
     * Given two List<Integer> objects, return a List containing
     * the values that appear in both lists.
     *
     * Each value should appear only once in the result.
     * Preserve the order in which the values appear in the first list.
     *
     * Example:
     * First:  [1, 2, 3, 4, 5, 3]
     * Second: [3, 5, 7, 9]
     *
     * Output: [3, 5]
     *
     */

    public static void main(String []args){

        List<Integer> firstList = List.of(
                1, 2, 3, 4, 5, 3
        );

        List<Integer> secondList = List.of(
                3, 5, 7, 9
        );

        List<Integer> commonElements = findCommonElements(firstList, secondList);

        System.out.println(commonElements);
    }

    public static List<Integer> findCommonElements(List<Integer> firstList, List<Integer> secondList) {

        Set<Integer> secondSet = new HashSet<>(secondList);
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int number : firstList) {

            if (secondSet.contains(number) && seen.add(number)) {
                result.add(number);
            }
        }

        return result;
    }
}
