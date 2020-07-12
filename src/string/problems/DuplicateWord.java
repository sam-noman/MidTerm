package string.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        Map<String, Integer> wordNLength = findDuplicateWord(st);
        //implement

        for (Map.Entry<String, Integer> entry : wordNLength.entrySet())
            System.out.println(" " + entry.getKey() + " : " + entry.getValue());
    }

    public static Map<String, Integer> findDuplicateWord(String sentence) {
        String[] splitWords = sentence.split(" ");
        Map<String, Integer> occurrences = new HashMap<String, Integer>();

        for (String word : splitWords) {
            Integer oldCount = occurrences.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            oldCount = oldCount + 1;
            if (oldCount > 0) {
                occurrences.put(word, oldCount);
            }

        }
        return occurrences;
    }

}
