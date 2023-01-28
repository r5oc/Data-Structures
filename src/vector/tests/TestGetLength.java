package vector.tests;


import vector.Vector;


public class TestGetLength {
    public static void main(String[] args) {
        Vector vector = new Vector(4);
        System.out.println("length: " + vector.getLength());  
        System.out.println(vector);
    }
}
