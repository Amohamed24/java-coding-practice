import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main (String[] args){

        // create words
        List<String> words = List.of(
                "java",
                "python",
                "java",
                "javascript",
                "java",
                "python"
        );

        // call countWords()
        Map<String, Integer> result = countWords(words);


        // print result
        System.out.println(result);
    }

    public static Map<String, Integer> countWords(List<String> words) {

        HashMap<String, Integer> hash = new HashMap<>();

        // for loop going through each word in List
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);

            if(!hash.containsKey(word)) {
                hash.put(word, 1);
            } else {
                hash.put(word, hash.get(word)+1);
            }
        }

        return hash;
    }
}
