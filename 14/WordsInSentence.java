package hw15;

import java.util.HashMap;

public class WordsInSentence {

    public static void main(String[] args) {
        String text = "A dream, all a dream, that ends in nothing, " +
                "and leaves the sleeper where he lay down, " +
                "but I wish you to know that you inspired it";
        // - Charles Dickens, A Tale of Two Cities

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] wordsCount = text.split("\\W+");
        for (String word : wordsCount) {
            Integer count = map.get(word);
            if (count == null) {
                count = 0;
            }
            map.put(word, count + 1);
        }

//        for (int i = 0; i< wordsCount.length; i++)
//        {
//          //  System.out.println(wordsCount[i]);
//        }
        System.out.println(map);
    }

//        HashMap<String,Long> wordsCount = (HashMap<String, Long>) Arrays.stream(text.split("\\W+"))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(wordsCount);

}
