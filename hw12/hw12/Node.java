package hw12;

public class Node<T> {
    Node<T> next;
    T data;

    public Node(T data, Node connect) {
        this.next = null;
        this.data = data;
    }

    public Node(T element) {
        this.data = element;
    }
}
