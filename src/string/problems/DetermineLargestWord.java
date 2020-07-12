package string.problems;

import java.util.*;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";

        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        for (Map.Entry<Integer,String> entry : wordNLength.entrySet())
            System.out.println(" " + entry.getKey() + " " + entry.getValue());
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        //implement

        String largestWord = Arrays.stream(wordGiven.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        int length = largestWord.length();
        map.put(length, largestWord);
        return map;
    }


}
