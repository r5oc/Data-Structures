package vector;


public class Vector {
    final int maxItems;
    private int size = 0;
    private String[] elements;

    public Vector(int maxItems){
        this.maxItems = maxItems;
        this.elements = new String[maxItems];
    }

    public void replace(int index, String item){
        if (index >= 0 && index < this.size){
            elements[index] = item;
        }
    }
    public void clear(){
        String[] newElements = new String[this.maxItems];
        this.elements = newElements;
        this.size = 0;
    }

    public int lastIndex(){
        return this.size - 1;
    }

    public String search(int index){
        if (index >= 0 && index < this.size){
            return elements[index];
        }
        throw new IllegalArgumentException("search [Invalid index]");
    }

    public int search(String item){
        for (int i = 0; i < this.size; i++){
            if (elements[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    public void remove(String item){
        remove(indexOf(item));
    }

    public int indexOf(String item){
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
        int length = this.maxItems - 1;
        for (int i = index; i < length; i++){
            elements[i] = elements[i+1];
        }
        elements[length] = null;
        size--;
    }

    public void add(int index, String item){
        if (!(index >= 0 && index < this.size)){
            throw new IllegalArgumentException("[Invalid position]");
        }
        else if (this.size == this.maxItems){
            throw new IndexOutOfBoundsException("[Vector is full]");
        }
        for(int i = this.size - 1; i >= index; i--){
            elements[i+1] = elements[i];
        }
        elements[index] = item;
        this.size++;
    }

    public void add(String item){
        if (this.size < maxItems){
            elements[this.size] = item;
            size++;
        }
    }

    public void autoFill(){
        int emptySpaces = this.maxItems - this.size;
        for (int i = 1; i < emptySpaces+1; i++){
            add("item " + i);
        }
    }

    public int getSize(){
        return this.size;
    }

    public int getLength(){
        return this.maxItems;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; ; i++) {
            sb.append(String.valueOf(elements[i]));
            if (i == this.maxItems-1)
                return sb.append(']').toString();
            sb.append(", ");
        }
    }
}
