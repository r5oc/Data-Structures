package vector.tests;

import vector.Vector;

public class FullTest {
    public static void main(String[] args) {
        int maxItems = 20;
        Vector vector = new Vector(maxItems);
        vector.autoFill();
        System.out.println(vector);


        for (int i = vector.getSize() - 1; i >= 0; i--){
            vector.remove(i);
        }
        
        System.out.println("all items in vector removed");
        System.out.println("Space of vector: " + vector.getLength() + "\nNull spaces: " + (vector.getLength() - vector.getSize()));
        

        System.out.println(vector);
        vector.add("test1");
        System.out.println(vector);
        System.out.println("Space of vector: " + vector.getLength() + "\nNull spaces: " + (vector.getLength() - vector.getSize()));


        System.out.println("index of 'test1': " + vector.indexOf("test1"));
        System.out.println("last index: " + vector.lastIndex());


        vector.autoFill();
        System.out.println(vector);
        System.out.println("search 'item 4' position: " + vector.search("item 4"));
        System.out.println("item in index '4': " + vector.search(vector.indexOf("item 4")));


        vector.replace(0, "xxx");
        vector.replace(19, "xxx");
        System.out.println(vector);

        vector.remove("xxx");
        System.out.println(vector);

        vector.clear();
        System.out.println(vector);

        vector.add("123");
        vector.add(0, "11");
        System.out.println(vector + "\n sucess");
    }

}
