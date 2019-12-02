public class Taskone {
    public static void main(String[] args) {

        int [] array = {12, 22, 34, 2, 23, 17, 326, 43, 8, 555, 1198};
        int [] childArray = { 23, 17, 326, 43};

        for (int i = 0; i < array.length; i++)
        {
            int a = array[i];
            for (int j = 0; j < childArray.length; j++)
            {
                if (a == childArray[j])
                {
                    System.out.print(a + " ");
                }
            }
        }

    }

}