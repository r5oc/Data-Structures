package vector.tests;

import vector.Vector;

public class TestIndexOf {
    public static void main(String[] args) {
        Vector vector = new Vector(10);
        vector.autoFill();
        System.out.println(vector);
        System.out.println(vector.indexOf("item 1"));
    
        System.out.println(vector.indexOf("item 10"));
    }
}
