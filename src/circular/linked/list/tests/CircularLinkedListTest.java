package circular.linked.list.tests;

import circular.linked.list.CircularLinkedList;

public class CircularLinkedListTest {
    public static void main(String[] args) {

        CircularLinkedList<String> cll = new CircularLinkedList<>();

        cll.add("c0");
        System.out.println(cll);

        cll.remove(0);
        System.out.println(cll);

        cll.add("c1");
        cll.add("c2");
        cll.add("c3");
        System.out.println("CircularLinkedList" + cll);

        System.out.println("\nlength: " + cll.getLength());

        System.out.println("circularity test");
        for (int i = 0; i < 9; i++) {
            System.out.print(cll.get(i));
            if ((i + 1) % 3 == 0) {
                System.out.print("    ");
            }
        }
        System.out.println("\n");

        System.out.println(cll);

        cll.remove(2);
        System.out.println(cll);

        cll.remove(1);
        System.out.println(cll);

        cll.remove(0);
        System.out.println(cll);
    }
}
