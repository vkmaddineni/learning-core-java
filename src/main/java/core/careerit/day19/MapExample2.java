package core.careerit.day19;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        String data = "Learning java is fun to have fun learn java in a fun way";
        String[] words = data.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word:words){
            wordCount.put(word, wordCount.getOrDefault(word , 0) + 1);
        }
          System.out.println(wordCount);

    }
}
