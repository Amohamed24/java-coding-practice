import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
     * Problem 9: Move Zeros to the End
     *
     * Given a List<Integer>, move all zeros to the end
     * while preserving the order of non-zero values.
     *
     * Example:
     * Input:  [0, 1, 0, 3, 12]
     * Output: [1, 3, 12, 0, 0]
     *
     */

    public static void main(String []args){

        List<Integer> numbers = new ArrayList<>(List.of(
                0, 1, 0, 3, 12
        ));

        List<Integer> answer = moveZerosToEnd(numbers);

        System.out.println(answer);
    }

    public static List<Integer> moveZerosToEnd(List<Integer> numbers){

        int writeIndex = 0;

        for (int i = 0; i < numbers.size(); i++) {

            int number = numbers.get(i);

            if (number != 0) {
                numbers.set(writeIndex, number);
                writeIndex++;
            }
        }

        while (writeIndex < numbers.size()) {
            numbers.set(writeIndex, 0);
            writeIndex++;
        }

        return numbers;
    }
}
