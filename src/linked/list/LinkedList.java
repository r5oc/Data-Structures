package linked.list;


public class LinkedList<T> {
    private Node<T> start;
    private Node<T> last;
    private int size = 0;


    public T remove(int index) {
        indexIsValid(index);

        Node<T> current = start;
        Node<T> previous = null;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.getNext();
        }

        if (previous == null) { // removing the head node
            start = start.getNext();
        } else {
            previous.setNext(current.getNext());
        }
        size--;
        return current.getItem();
    }

    public T get(int index){
        return getNode(index).getItem();
    }

    private Node<T> getNode(int index){
        this.indexIsValid(index);
        Node<T> nodeAux = this.start;
        Node<T> returnNode = null;

        for (int i = 0; i <= index; i++){
            returnNode = nodeAux;
            nodeAux = nodeAux.getNext();
        }
        return returnNode;
    }

    public void indexIsValid(int index){
        if (index >= this.size || index < 0){
            int lastIndex = this.size-1;
            throw  new IndexOutOfBoundsException("Index :" + index + " is not valid");
        }
    }

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
            sb.append(current.getItem()).append(" --> ");
            current = current.getNext();
        }
        try {
            sb.append(current.getItem());
        }
        catch   (NullPointerException e){
            sb.delete(sb.lastIndexOf(" --> "), sb.length()-1);
        }
        sb.append("]");

        return "LinkedList: " + sb;
    }
}
