package linked.list.tests;

import linked.list.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println("size: " + ll.getSize() + " " + ll);

        ll.clear();
        System.out.println("\nsize: " + ll.getSize() + " " + ll);
    }
}
