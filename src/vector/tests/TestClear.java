package vector.tests;

import vector.Vector;

public class TestClear {
    public static void main(String[] args) {
        Vector vector = new Vector(10);
        vector.autoFill();
        System.out.println(vector);
        vector.clear();
        System.out.println(vector);
    }
}
