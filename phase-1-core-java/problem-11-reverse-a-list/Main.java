import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
     * Problem 11: Reverse a List In Place
     *
     * Given a List<Integer>, reverse the order
     * of its elements in place.
     *
     * Example:
     * Input:  [1, 2, 3, 4, 5]
     * Output: [5, 4, 3, 2, 1]
     *
     */

    public static void main(String []args){

        List<Integer> nums = new ArrayList<>(List.of(
                1, 2, 3, 4, 5
        ));

        List<Integer> result = reverseList(nums);

        System.out.println(result);
    }

    public static List<Integer> reverseList(List<Integer> nums){

        int left = 0;
        int right = nums.size()-1;

        while (left < right) {

            int temp = nums.get(left);
            nums.set(left, nums.get(right));
            nums.set(right, temp);

            left++;
            right--;
        }

        return nums;
    }
}
