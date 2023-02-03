package linked.list;

public class Node<T> {
    private T item;
    private Node<T> next;


    public Node(T item) {
        this.item = item;
        this.next = null;
    }

    public Node(T item, Node<T> next) {
        this.item = item;
        this.next = next;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(item).append(" ").append(next).append("]");
        return sb.toString();
    }
}
