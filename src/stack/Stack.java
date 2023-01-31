package stack;

import java.util.Arrays;

public class Stack<T> {
    private T[] elements;
    private int size = 0;

    public int search(T item){
        for (int i = 0; i < this.size; i++){
            if (elements[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    public Stack(int capacity) {
        if (capacity < 0){
            throw new NegativeArraySizeException();
        }
        this.elements = (T[]) new Object[capacity];
    }

    public void remove(){
        if (isEmpty()){
            throw new IllegalArgumentException("[Stack is empty]");
        }
        this.size--;
        this.elements[this.size] = null;
    }

    public void add(T item){
        if (isFull()){
            throw new IllegalArgumentException("[Stack is full]");
        }
        this.elements[size] = item;
        this.size++;
    }

    public int getLength(){
        return this.elements.length;
    }

    public int getSize(){
        return this.size;
    }

    public boolean isFull(){
        return this.size == this.elements.length;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    @Override
    public String toString() {
        return "Stack [elements=" + Arrays.toString(elements) + ", size=" + size + "]";
    }
}
