package vector.tests;

import vector.Vector;

public class TestAdd {
    public static void main(String[] args) {
        Vector vector = new Vector(4);
        
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("d");
        System.out.println(vector);
    }
}
