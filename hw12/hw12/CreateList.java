package hw12;

public class CreateList {
    public static void main(String[] args) {
        List<Integer> gone = new List<Integer>();
        gone.addFront(12);
        gone.addFront(14);
        gone.addFront(23);
        gone.addFront(22);
        gone.addLast(1983);
        gone.addLast(2020);

        gone.removeFirst();
        gone.removeLast();


        gone.print();
        System.out.println();
        gone.removeIn(2);
        gone.addByIndex(16, 1);

        gone.print();

        System.out.println();

        gone.swap(16, 14);

        gone.print();

        System.out.println();

        System.out.println("Hey, I think that is nobody there...." + gone.isEmpty());
        System.out.println("How many guys was there?  " + gone.sizeArray);


    }

}
