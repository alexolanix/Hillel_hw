public class Task4 {
    public static void main(String[] args) {
        int k = 13;
        int n = (int) Math.sqrt(k)+1;
        int[][] mArray = new int[n][n];
        int a = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) {
                a++;
                mArray[i][j] = a;

                if (mArray[i][j] > k){
                    mArray[i][j] = 0;
                }

                System.out.print(mArray[i][j] + " ");
            }
            System.out.println();

        }
    }
}