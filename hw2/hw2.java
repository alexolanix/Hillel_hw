/*
Homework A Perederii
*/

public class Expoone {


    public static void main(String[] args) {
//Реализуем вывод и список методов
        trickTruck();
        System.out.println();
        minMax();
        System.out.println();
        fibo();
        System.out.println();
        simple();
    }

    //Дальше мясо

    // Находим Нечетные и четные числа выявляя числа которые делятся с остатком и без
    private static void trickTruck(){
        int uMx[] = {12, 73, 45, 23, 3, 54, 34, 1, 42};
        for (int i = 0; i < 9; i++)
            System.out.print(uMx[i] + " ");
        	System.out.println();
        	System.out.print("Odd: ");
        
        for (int l : uMx) {
            if (l % 2 != 0) System.out.print(l + " ");
        }
       
        System.out.println();
        System.out.print("Even: ");
        
        for (int k : uMx) {
            if (k % 2 == 0) System.out.print(k + " ");
        }
    }

    // Вычисляем максимум и минимум перебором и сравнением
    private static void minMax(){
        int uMx[] = {12, 73, 45, 23, 3, 54, 34, 1, 42};
        int max = uMx[0];
        int min = uMx[0];
        for (int i = 0; i < uMx.length-1; i++) {
            if (uMx[i] > max) {
                max = uMx[i];
            } else if (uMx[i] < min) {
                min = uMx[i];
            }
            }
        System.out.print("Minimum " + min + "\nMaximum " + max);
    }

    // числа Фибоначчи первые две позиции указываем явно
    private static void fibo(){
        int uMx[] = new int[20];
        System.out.print("Fibo: ");
        uMx[0] = 1;
        uMx[1] = 1;
        for(int k = 2; k < uMx.length; k++){
             uMx[k] = uMx[k-1]+uMx[k-2];
            }
        for(int i = 0; i < uMx.length; i++){
        System.out.print(uMx[i] + " ");
        }
    }

    // Вычисляем простые числа из явно заданного массива
    private static void simple(){
        int uMx[] = {12, 73, 45, 23, 3, 54, 34, 1, 42};
            System.out.print("Simple: ");

            for (int i = 0; i < uMx.length; i++) {
            if (simp(uMx[i]) == 1) {
                System.out.print(uMx[i] + " ");
            }
        }
    }

    private static int simp(int dig) {
        for (int i = 2; i < dig; i++) {
            if (dig % i == 0) {
                return 0;
            }

            if ((i == dig) || (i > Math.sqrt(dig))) {
                return 1;
            }
        }

        return 0;
    }
}
