package vector.tests;

import vector.Vector;

public class TestAdd2 {
    public static void main(String[] args) {
        Vector vector = new Vector(4);
        vector.autoFill();
        vector.remove(0);
        vector.remove(0);
        System.out.println(vector);

        vector.add(1, "xxxxx");
        System.out.println(vector);

        vector.add(1, "ttttt");
        System.out.println(vector);

        try{
            vector.add(1, "vvvvv");
            System.out.println(vector);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(vector);
            System.out.println("Sucess");
        }
    }
}
