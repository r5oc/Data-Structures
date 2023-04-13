package binary.tree.tests;

import binary.tree.BinaryTree;
import binary.tree.model.Object;

public class BinaryTreeTests {
    public static void main(String[] args) {
        BinaryTree<Object> tree = new BinaryTree<>();

        tree.insert(new Object(13));
        tree.insert(new Object(10));
        tree.insert(new Object(25));
        tree.insert(new Object(2));
        tree.insert(new Object(12));
        tree.insert(new Object(20));
        tree.insert(new Object(31));
        tree.insert(new Object(29));

        Object td = new Object(32);

        tree.insert(td);

        tree.showInOrder();
        tree.showBeforeOrder();
        tree.showAfterOrder();

        tree.remove(td);
        tree.removeRecusively(td);

        tree.showInOrder();
        tree.showBeforeOrder();
        tree.showAfterOrder();



    }
}
