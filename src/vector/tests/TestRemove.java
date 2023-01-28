package vector.tests;

import vector.Vector;

public class TestRemove {
    public static void main(String[] args) {
        int maxItems = 4;
        Vector vector = new Vector(maxItems);
        vector.autoFill();

        // Test remove
        vector.remove(0);
        System.out.println(vector);

        vector.remove(1);
        System.out.println(vector);

        vector.remove(0);
        System.out.println(vector);

        vector.remove(0);
        System.out.println(vector);

        // Expected error [Invalid position]
        try{
            vector.remove(0);
            System.out.println(vector);
        }
        catch (IllegalArgumentException e){
            System.out.println("Sucess");
        };
    }

}
