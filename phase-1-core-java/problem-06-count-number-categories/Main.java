import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String []args){

        List<Integer> numbers = List.of(
          2, 0, 3, 5, -1, 0
        );

        Map<String, Integer> result = countNumberCategory(numbers);

        System.out.println(result);
    }

    public static Map<String, Integer> countNumberCategory(List<Integer> numbers) {

        Map<String, Integer> count = new HashMap<>();

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int number : numbers) {
            if (number > 0) {
                positive ++;
            } else if (number < 0) {
                negative ++;
            } else {
                zero ++;
            }
        }

        count.put("positive", positive);
        count.put("negative", negative);
        count.put("zero", zero);

        return count;
    }
}
