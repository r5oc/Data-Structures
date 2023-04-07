package circular.linked.list;

public class CircularLinkedList<T> {
    private Node<T> start;
    private Node<T> end;
    private int length;

    public CircularLinkedList() {
        this.end = null;
        this.start = null;
        this.length = 0;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);

        if (this.isEmpty()){
            this.start = newNode;
            this.end = this.start;
            this.start.setNext(this.end);
        }
        else {
            newNode.setNext(this.end);
            this.start.setNext(newNode);
            this.end = newNode;
        }
        this.length++;
    }
    public void remove(int index){
        if (index >= this.length) throw new IndexOutOfBoundsException("[The index is greater than the size of the list]");

        Node<T> nodeAux = this.end;
        if (index == 0){
            this.end = this.end.getNext();
            this.start.setNext(this.end);
        }
        else if (index == 1){
            this.end.setNext(this.end.getNext().getNext());
        }
        else{
            for (int i = 0; i < index - 1; i++){
                nodeAux = nodeAux.getNext();
            }
            nodeAux.setNext(nodeAux.getNext().getNext());
        }
        this.length--;
    }

    public T get(int index){
        return this.getNode(index).getData();
    }

    private Node<T> getNode(int index){
        if (this.isEmpty()) throw new IndexOutOfBoundsException("[List is empty]");

        if (index == 0) return this.end;

        Node<T> nodeAux = this.end;
        for (int i = 0; i < index; i++){
            nodeAux = nodeAux.getNext();
        }
        return nodeAux;
    }
    private boolean isEmpty(){
        return this.length == 0;
    }

    public int getLength(){
        return this.length;
    }

    @Override
    public String toString() {
        String stringReturn = "";

        Node<T> nodeAux = this.end;
        for (int i = 0; i < this.length; i++){
            stringReturn += ("[Node " + nodeAux.getData() + "] --> ");
            nodeAux = nodeAux.getNext();
        }

        stringReturn += this.length != 0 ? " Back to the beginning" : "[]";

        return stringReturn;
    }
}
