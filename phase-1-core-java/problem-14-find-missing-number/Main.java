import java.util.List;

public class Main {

    /*
     * Problem 14: Find the Missing Number
     *
     * Given a List<Integer> containing numbers from 1 to n,
     * with exactly one number missing, return the missing number.
     *
     * The list may be in any order, and each number appears at most once.
     * Do not sort the list or use extra collections.
     *
     * Example:
     * Input:  [5, 2, 1, 4]
     * Output: 3
     *
     */

    public static void main(String []args){

        List<Integer> numbers = List.of(5, 2, 1, 4);

        int solution = missingNum(numbers);
        System.out.println(solution);
    }

    public static int missingNum(List<Integer> numbers) {

        // find the largest possible number
        int n = numbers.size() + 1;

        // calc the expected sum from 1 to n
        int expectedSum = n * (n+1) / 2;

        // calc the current sum
        int actualSum = 0;

        for (int num : numbers) {
            actualSum += num;
        }

        // return the diff since that's missing num
        return expectedSum - actualSum;
    }
}
