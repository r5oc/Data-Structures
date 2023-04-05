package linked.list.tests;

import linked.list.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        for (int i = 1; i < 5; i++) {
            ll.add(i);
        }

        for (int i = 0; i < ll.getSize(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println("\n");
        System.out.println(ll + " [size: " + ll.getSize() + "]\n");

        ll.remove(3);
        System.out.println(ll + " [size: " + ll.getSize() + "]\n");

        ll.remove(0);
        System.out.println(ll + " [size: " + ll.getSize() + "]\n");

        ll.clear();
        System.out.println(ll + " [size: " + ll.getSize() + "]\n");

    }
}
