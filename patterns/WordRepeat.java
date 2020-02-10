package patterns;

import java.util.HashMap;
import java.util.regex.Pattern;

public class WordRepeat {
    static String string = "So, I think, that it is a good day to die, but," +
            " if it`s not a good day? What should I do?";

    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\W+");
        String wordCount[] = p.split(string);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String word: wordCount){
            Integer count = map.get(word);
            if (count == null) {
                count = 0;
            }
            map.put(word, count + 1);
        }
        System.out.println(map);
    }
}
