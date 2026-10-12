import java.util.List;
import java.util.Objects;

public class Main {

    /*
     * Problem 12: Check Whether a List Is a Palindrome
     *
     * Given a List<Integer>, determine whether the list
     * reads the same forward and backward.
     *
     * Example:
     * Input:  [1, 2, 3, 2, 1]
     * Output: true
     *
     */

    public static void main(String []args){

        List<Integer> nums = List.of(
                1, 2, 3, 2, 1
        );

        boolean result = palindromeCheck(nums);

        System.out.println(result);
    }

    public static boolean palindromeCheck(List<Integer> nums){

        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {

            if (Objects.equals(nums.get(left), nums.get(right))) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
