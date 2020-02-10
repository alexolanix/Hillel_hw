package patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommasAndTheirFriends {
    static String string = "So, I think, that it is a good day to die, but, if it`s not a good day? What should I do?";

    public static void main(String[] args) {
        String regEx= "[\\p{Punct}]";
        Pattern p = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(string);
        int count = 0;
        while (m.find())
            count++;

        System.out.println("number of marks: " + count);

    }
}
