package list;


public class List<T> {
    private int size = 0;
    private Object[] elements;

    public List(int maxItems){
        maxItemsValidation(maxItems);
        this.elements = (T[]) new Object[maxItems];
    }


    public boolean contains(Object item){
        for (int i = 0; i < this.elements.length; i++){
            if (elements[i].equals(item)){
                return true;
            }
        }
        return false;
    }

    public void maxItemsValidation(int maxItems){
        if (maxItems <= 0){
            maxItems = 1;
        }
    }

    public void expand(){
        if (this.size == this.elements.length){
            T[] newElements = (T[]) new Object[((this.elements.length * 3) / 2) + 1];

            for (int i = 0; i < this.elements.length; i++){
                newElements[i] = (T) this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public void replace(int index, Object item){
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

    public void remove(Object item){
        remove(indexOf(item));
    }

    public int indexOf(Object item){
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

    public void add(int index, Object item){
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

    public void add(Object item){
        this.expand();
        if (this.size < this.elements.length){
            elements[this.size] = item;
            size++;
        }
    }

    public void autoFill(){
        int emptySpaces = this.elements.length - this.size;
        for (int i = 1; i < emptySpaces+1; i++){
            add(i);
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
