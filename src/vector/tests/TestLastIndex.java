package vector.tests;

import vector.Vector;

public class TestLastIndex {
    public static void main(String[] args) {

        Vector vector = new Vector(5);
        vector.autoFill();
        System.out.println(vector.lastIndex());
        vector.remove(4);
        System.out.println(vector.lastIndex() + "\nSucess");
    }
}
