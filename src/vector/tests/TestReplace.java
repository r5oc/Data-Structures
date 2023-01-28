package vector.tests;

import vector.Vector;

public class TestReplace {
    public static void main(String[] args) {
        Vector vector = new Vector(10);
        vector.autoFill();
        System.out.println(vector);

        for (int i = 0; i < vector.getSize(); i++){
            vector.replace(i, "y");
        }
        for (int i = 0; i < vector.getSize(); i+=2){
            vector.replace(i, "x");
        }
        System.out.println(vector);
    }
}
