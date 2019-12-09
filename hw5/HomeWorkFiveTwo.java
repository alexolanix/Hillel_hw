class HomeWorkFiveTwo {
    static void recTen(int n) {
        if (n == 0)
            return;
        else
            recTen(n - 1);
        System.out.print(n + " ");
    }
}

class ResultHomeWorkFiveTwo {
    public static void main(String[] args) {
        System.out.print("Ввод 9 -> вывод ");
        HomeWorkFiveTwo.recTen(9);
    }

}