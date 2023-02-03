package linked.list;


public class LinkedList<T> {
    private Node<T> start;
    private Node<T> last;
    private int size = 0;


    public void clear(){
        for (Node<T> current = this.start; current != null;){
            Node<T> next = current.getNext();
            current.setItem(null);
            current.setNext(null);
            current = next;
        }
        this.start = null;
        this.last = null;
        this.size = 0;
    }

    public void add(T item){
        Node<T> cell = new Node<>(item);
        if (this.size == 0){
            this.start = cell;
        }
        else {
            this.last.setNext(cell);
        }
        this.last = cell;
        this.size++;
    }

    public int getSize(){
        return this.size;
    }

    @Override
    public String toString() {
        if (this.size == 0) {return "LinkedList: []";}

        StringBuilder sb = new StringBuilder("[");
        Node<T> current = this.start;

        for (int i = 0; i < this.size - 1; i++){
            sb.append(current.getItem()).append(", ");
            current = current.getNext();
        }
        sb.append(current.getItem()).append("]");

        return "LinkedList: " + sb.toString();
    }

}
