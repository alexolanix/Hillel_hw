public class Task3 {
    public static void main(String[] args) {
        int [] arrayThree = {1, 14, 235, 222, 445, 378, 999, 332, 643, 602};
        for(int i = 0; i < arrayThree.length; i++){
            if (arrayThree[i] > 9) {
                if (differentParts(arrayThree[i]) == false) {
                    System.out.print(arrayThree[i] + " ");
                }
            }
        }
    }

    private static boolean differentParts(int x) {

        x = Math.abs(x);

        boolean parts[]  = new boolean[10]; // as told at previous lecture

        while (x > 0) {
            int y = x % 10;
            if (parts[y])
                return true;

            parts[y] = true;
            x /= 10;
        }

        return false;
    }
}
