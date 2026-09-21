import java.util.List;

public class Main {

    public static void main(String []args){

        /*
         * Problem 8: Find Second Largest Unique Number
         *
         * Given a List<Integer>, find the second largest
         * unique value without sorting the list.
         *
         * Example:
         * Input:  [4, 7, 2, 9, 7, 5]
         * Output: 7
         *
         */

        List<Integer> numbers = List.of(
                4, 7, 2, 9, 7, 5
        );

        int result = secondLargestValue(numbers);

        System.out.println(result);
    }

    public static int secondLargestValue(List<Integer> numbers) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int number : numbers) {

            if (number > first) {
                second = first;
                first = number;
            } else if (number < first && number > second) {
                second = number;
            }
        }

        return second;
    }
}
