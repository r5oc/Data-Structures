package vector.tests;


import vector.Vector;

public class TestSearchIndex {
    public static void main(String[] args) {
        int maxItems = 11;
        Vector vector = new Vector(maxItems);
        vector.autoFill();

        System.out.println(vector);
        System.out.println(vector.search(0));
        System.out.println(vector.search(10));
        
        try{
            System.out.println(vector.search(11));       
        }
        catch (IllegalArgumentException e){
            System.out.println("Sucess");
        }
    }
}
