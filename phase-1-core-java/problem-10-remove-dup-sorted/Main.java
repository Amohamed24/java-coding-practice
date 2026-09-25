import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
     * Problem 10: Remove Duplicates from a Sorted List
     *
     * Given a sorted List<Integer>, remove duplicate
     * values in place so that each value appears only once.
     *
     * Example:
     * Input:  [1, 1, 2, 2, 2, 3, 4, 4]
     * Output: [1, 2, 3, 4]
     *
     */

    public static void main(String []args){

        List<Integer> numbers = new ArrayList<>(List.of(
                1, 1, 2, 2, 2, 3, 4, 4
        ));

        List<Integer> result = removeDupsFromSortedList(numbers);

        System.out.println(result);
    }

    public static List<Integer> removeDupsFromSortedList(List<Integer> numbers){

        if (numbers.isEmpty()) {
            return numbers;
        }

        int writeIndex = 1;

        for (int readIndex = 1; readIndex < numbers.size(); readIndex++) {

            int curr = numbers.get(readIndex);
            int prevUnique = numbers.get(writeIndex - 1);


            if (curr != prevUnique) {
                numbers.set(writeIndex, curr);
                writeIndex++;
            }
        }

        while (numbers.size() > writeIndex) {
            numbers.removeLast();
        }

        return numbers;
    }
}
