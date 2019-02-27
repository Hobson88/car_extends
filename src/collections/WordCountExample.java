package collections;

import java.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WordCountExample {
    public static void main(String[] args) {
        String text = "ala ma kota i i i ii i i i i i i i i i i i i drugiego kota a nawet trzeciego kota bo to jest ala ala ala ala ala ala";
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = text.split(" ");


       for (String word: words){
            Integer currentCount = wordCount.get(word);
              if (currentCount != null){
                  wordCount.put(word,++currentCount);
              }else {
                  wordCount.put(word,1);
              }
          }

      /*    for (String word: words){
              if (wordCount.containsKey(word)){
                  Integer count = wordCount.get(word);
                  count++;
                  wordCount.put(word,count);
              }else {
                  wordCount.put(word,1);
              }
          }
        szybsza wersja
        Stream.of(words).forEach(word -> wordCount.merge(word, 1, (old, value) -> old + value));*/

        System.out.println(wordCount);
    }
}
