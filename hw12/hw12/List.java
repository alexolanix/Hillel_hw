package hw12;

public class List<T> {
    int sizeArray;
    private Node<T> front;

    public List() {
    }

    public List(T[] nodeArray) {
        for (T element : nodeArray)
            addLast(element);
        sizeArray++;
    }

    void addFront(T element) {
        Node<T> temp = new Node<T>(element);
        temp.next = front;
        front = temp;
        sizeArray++;
    }

    void addLast(T element) {
        Node<T> endF = new Node<T>(element);
        if (isEmpty()) {
            addFront(element);
        } else {
            Node<T> end = front;
            while (end.next != null) {
                end = end.next;
            }
            end.next = endF;
            sizeArray++;
        }
    }

    public void addByIndex(T element, int index) {
        if (index < 0 || index > sizeArray + 1) {
            System.out.println("Insert out of bounce");
            return;
        }

        if (front == null) {
            front = new Node(element);
            sizeArray++;
            return;
        }

        if (index == 0) {
            addFront(element);
            return;
        }

        Node<T> current = front;

        int sub = 1;
        while (current.next != null && sub < index - 1) {
            current = current.next;
            sub++;
        }

        Node<T> newNode = new Node<T>(element);
        newNode.next = current.next;
        current.next = newNode;
        sizeArray++;
    }


    public boolean isEmpty() {
        return front == null;
    }

    public void removeIn(Integer index) {
        if (isEmpty())
            return;
        Node<T> temp = front;
        if (index == 0) {
            front = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null)
            return;
        temp.next = temp.next.next;
        sizeArray--;
    }


    public void removeFirst() {
        front = front.next;
        sizeArray--;
    }

    public void removeLast() {
        if (!isEmpty()) {
            removeIn(sizeArray - 1);
        }

    }

    public void swap(Integer firstParameter, Integer secondParameter) {
        Node<T> prevNode1 = null, prevNode2 = null, node1 = front, node2 = front;

        if (front == null) {
            return;
        }

        if (firstParameter == secondParameter)
            return;

        while (node1 != null && node1.data != firstParameter) {
            prevNode1 = node1;
            node1 = node1.next;
        }

        while (node2 != null && node2.data != secondParameter) {
            prevNode2 = node2;
            node2 = node2.next;
        }

        if (node1 != null && node2 != null) {


            if (prevNode1 != null) {
                prevNode1.next = node2;
            } else {
                front = node2;
            }


            if (prevNode2 != null) {
                prevNode2.next = node1;
            } else {
                front = node1;
            }


            Node temp = node1.next;
            node1.next = node2.next;
            node2.next = temp;
        } else {
            System.out.println("Swapping is not possible");
        }
    }

    public void print() {
        Node<T> temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
