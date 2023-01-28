package vector.tests;


import vector.Vector;

public class TestSearchString {
    public static void main(String[] args) {

        int maxItems = 11;
        Vector vector = new Vector(maxItems);
        vector.autoFill();

        System.out.println("\n" + vector + "\n");

        for (int i = 0; i < maxItems; i++){
            System.out.print(vector.indexOf("item " + i) + " ");
        }
        System.out.println();  
        for (int i = maxItems-1; i >= 0; i--){
            System.out.print(vector.indexOf("item " + i) + " ");
        }
        System.out.println("\nSucess");
    }
}
