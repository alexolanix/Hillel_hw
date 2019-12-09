public class HomeWorkFiveThree {
    static int countDigit(int n) {
        if (n < 10)
            return n;
        else
            return n % 10 + countDigit(n / 10);

    }

    public static void main(String[] args) {
        System.out.println(countDigit(567));
    }
}