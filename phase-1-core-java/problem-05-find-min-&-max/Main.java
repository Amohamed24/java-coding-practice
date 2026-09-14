import java.util.Arrays;
import java.util.List;

public class Main {

    /*
     * Problem 5: Find Minimum and Maximum
     *
     * Given a non-empty List<Integer>, find the smallest
     * and largest values without sorting the list.
     *
     * Example:
     * Input:  [8, 3, 11, -2, 6]
     * Output: [-2, 11]
     *
     */

    public static void main(String []args){

        List<Integer> values = List.of(
          8, 3, 11, -2, 6
        );

        int[] minMax = findSmallestAndLargestNum(values);

        System.out.println(Arrays.toString(minMax));
    }

    public static int[] findSmallestAndLargestNum(List<Integer> values) {

        int smallest = values.getFirst();
        int largest = values.getFirst();

        for (Integer element : values) {

            if (element < smallest) {
                smallest = element;
            }

            if (element > largest) {
                largest = element;
            }
        }

        return new int[] {smallest, largest};
    }
}
