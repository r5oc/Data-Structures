package list;


public class List<T> {
    private int size = 0;
    private T[] elements;

    public List(int capacity){
        maxItemsValidation(capacity);
        this.elements = (T[]) new Object[capacity];
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

    private void expand(){
        if (this.size == this.elements.length){
            T[] newElements = (T[]) new Object[((this.elements.length * 3) / 2) + 1];

            for (int i = 0; i < this.elements.length; i++){
                newElements[i] = (T) this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public void replace(int index, T item){
        if (index >= 0 && index < this.size){
            elements[index] = item;
        }
    }

    public void clear(){
        for (int i = 0; i < this.size; i++){
            this.elements = null;
        }
        this.size = 0;
    }

    public int lastIndex(){
        return this.size - 1;
    }

    public Object search(int index){
        if (index >= 0 && index < this.size){
            return elements[index];
        }
        throw new IllegalArgumentException("search [Invalid index]");
    }

    public int search(Object item){
        for (int i = 0; i < this.size; i++){
            if (elements[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    public void remove(T item){
        remove(indexOf(item));
    }

    public int indexOf(T item){
        for (int i = 0; i < this.size; i++){
            if (elements[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    public void remove(int index){
        if (!(index >= 0 && index < this.size)){
            throw new IllegalArgumentException("[Invalid position]. Check that the item in the index has not been removed.");
        }
        int length = this.elements.length - 1;
        for (int i = index; i < length; i++){
            elements[i] = elements[i+1];
        }
        elements[length] = null;
        size--;
    }

    public void add(int index, T item){
        if (!(index >= 0 && index < this.size)){
            throw new IllegalArgumentException("[Invalid position]");
        }

        this.expand();

        for(int i = this.size - 1; i >= index; i--){
            elements[i+1] = elements[i];
        }
        elements[index] = item;
        this.size++;
    }

    public void add(T item){
        this.expand();
        if (this.size < this.elements.length){
            elements[this.size] = item;
            size++;
        }
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
