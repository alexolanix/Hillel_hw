public class Tasktwo {
    public static void main(String[] args) {
        int arrayNorm[] = {160, 1582, 335, 22, 65, 1, -45687, 258, 1111};
        int max = arrayNorm[0];
        int min = arrayNorm[0];
        for(int k = 0; k < arrayNorm.length; k++){
            if (arrayNorm[k] < 0) {
            arrayNorm[k] = arrayNorm[k] * (-1);
            }
        }

        for (int i = 0; i < arrayNorm.length; i++) {
           if (arrayNorm[i] > max) {
                max = arrayNorm[i];
            } else if (arrayNorm[i] < min) {
                min = arrayNorm[i];
            }
        }

        int maxC = countDigits(max);
        int minC = countDigits(min);
            System.out.println("Minimal: " + minC + " : " + min);
            System.out.println("Maximal: " + maxC + " : " + max);

    }

    public static int countDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0){
            count ++;
            number = number/10;
        }
        return count;
    }
}
