package queue;

public class Queue<T> {
    private int size = 0;
    private T[] elements;

    public Queue(int capacity){
        maxItemsValidation(capacity);
        this.elements = (T[]) new Object[capacity];
    }

    public void remove(){
        if (isEmpty()){
            throw new IllegalArgumentException("[Stack is empty]");
        }

        for (int i = 0; i < this.elements.length-1; i++){
            this.elements[i] = this.elements[i+1];
        }
        this.elements[this.elements.length-1] = null;
        this.size--;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public boolean isFull(){
        return this.size == this.elements.length;
    }

    public boolean contains(T item){
        for (int i = 0; i < this.elements.length; i++){
            if (elements[i].equals(item)){
                return true;
            }
        }
        return false;
    }

    public void maxItemsValidation(int capacity){
        if (capacity < 0){
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
    }

    public void add(T item){
        if (isFull()){
            throw new IllegalArgumentException("[Stack is full]");
        }
        this.elements[this.size] = item;
        this.size++;
    }

    public int getSize(){
        return this.size;
    }

    public int getLength(){
        return this.elements.length;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; ; i++) {
            sb.append(elements[i]);
            if (i == this.elements.length-1)
                return sb.append(']').toString();
            sb.append(", ");
        }
    }
}
