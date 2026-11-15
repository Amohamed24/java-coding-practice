import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
     * Problem 13: Merge Two Sorted Lists
     *
     * Given two List<Integer> objects sorted in ascending order,
     * merge them into one new sorted list containing all elements.
     *
     * The merged list must remain sorted and preserve duplicates.
     * Do not use any built-in sorting methods.
     *
     * Example:
     * Input:  list1 = [1, 3, 5, 7]
     *         list2 = [2, 4, 6, 8]
     * Output: [1, 2, 3, 4, 5, 6, 7, 8]
     *
     */

    public static void main(String []args){

        List<Integer> list1 = List.of(1, 3, 5, 7);
        List<Integer> list2 = List.of(2, 4, 6, 8);

        List<Integer> res = mergeToOneList(list1, list2);
        System.out.println(res);
    }

    public static List<Integer> mergeToOneList(List<Integer> list1, List<Integer> list2) {

        List<Integer> newList = new ArrayList<>();

        int left = 0;
        int right = 0;

        // compare both lists while they're both still available
        while(left < list1.size() && right < list2.size()) {

            int num1 = list1.get(left);
            int num2 = list2.get(right);

            if (num1 <= num2) {
                newList.add(num1);
                left++;
            } else {
                newList.add(num2);
                right++;
            }
        }

        // add remaining list
        while(left < list1.size()) {
            newList.add(list1.get(left));
            left++;
        }

        while(right < list2.size()) {
            newList.add(list2.get(right));
            right++;
        }

        return newList;
    }
}