package hw15.postfix;

public class Des{
    public static void main(String[] args) {
        String s = "(2+4)-43*14";
        Solution a = new Solution();

        System.out.println(a.calculate(s));
    }

}
