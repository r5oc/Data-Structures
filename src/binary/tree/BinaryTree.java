package binary.tree;


public class BinaryTree<T extends Comparable<T>> {

    private BinaryNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T data){
        BinaryNode<T> newNode = new BinaryNode<>(data);
        root = insert(root, newNode);
    }

    private BinaryNode<T> insert(BinaryNode<T> current, BinaryNode<T> newNode){

        if (current == null){
            return newNode;
        }
        
        else if (newNode.getData().compareTo(current.getData()) < 0){
            current.setLeftNode(insert(current.getLeftNode(), newNode));
        }

        else{
            current.setRightNode(insert(current.getRightNode(), newNode));
        }

        return current;
    }

    public void showInOrder(){
        System.out.println("\nshowInOrder invoked");
        showInOrder(this.root);
    }

    private void showInOrder(BinaryNode<T> current){
        if (current != null){
            showInOrder(current.getLeftNode());
            System.out.print(current.getData() + ", ");
            showInOrder(current.getRightNode());
        }
    }

    public void showAfterOrder(){
        System.out.println("\nshowAfterOrder invoked");
        showAfterOrder(this.root);
    }

    private void showAfterOrder(BinaryNode<T> current){
        if (current != null){
            showAfterOrder(current.getLeftNode());
            showAfterOrder(current.getRightNode());
            System.out.print(current.getData() + ", ");
        }
    }

    public void showBeforeOrder(){
        System.out.println("\nshowBeforeOrder invoked");
        showBeforeOrder(this.root);
    }

    private void showBeforeOrder(BinaryNode<T> current){
        if (current != null){
            System.out.print(current.getData() + ", ");
            showBeforeOrder(current.getLeftNode());
            showBeforeOrder(current.getRightNode());
        }
    }

    public void removeRecusively(T data) {
        root = remove(root, data);
    }

    private BinaryNode<T> remove(BinaryNode<T> current, T data) {
        if (current == null) {
            return null;
        }

        if (data.compareTo(current.getData()) < 0) {
            current.setLeftNode(remove(current.getLeftNode(), data));
        }
        else if (data.compareTo(current.getData()) > 0) {
            current.setRightNode(remove(current.getRightNode(), data));
        }
        else {
            // found the node to remove
            if (current.getLeftNode() == null && current.getRightNode() == null) {
                // case 1: node is a leaf node
                return null;
            }
            else if (current.getLeftNode() == null) {
                // case 2a: node has only a right child
                return current.getRightNode();
            }
            else if (current.getRightNode() == null) {
                // case 2b: node has only a left child
                return current.getLeftNode();
            }
            else {
                // case 3: node has two children
                BinaryNode<T> minNode = findMinNode(current.getRightNode());
                current.setData(minNode.getData());
                current.setRightNode(remove(current.getRightNode(), minNode.getData()));
            }
        }

        return current;
    }

    private BinaryNode<T> findMinNode(BinaryNode<T> current) {
        if (current.getLeftNode() == null) {
            return current;
        } else {
            return findMinNode(current.getLeftNode());
        }
    }


    public void remove(T data){
        try {
            BinaryNode<T> current = this.root;
            BinaryNode<T> father = null;
            BinaryNode<T> son = null;
            BinaryNode<T> temp = null;

            while (current != null && !current.getData().equals(data)){
                father = current;

                if (data.compareTo(current.getData()) < 0) {
                    current = current.getLeftNode();
                }
                else{
                    current = current.getRightNode();
                }
            }

            if (current == null){
                System.out.println("Data not found. [Try]");
            }

            if  (father == null){

                if (current.getRightNode() == null) {
                    this.root = current.getLeftNode();
                }
                else if (current.getLeftNode() == null) {
                    this.root = current.getRightNode();
                }
                else{
                    for(temp = current, son = current.getLeftNode();
                        son.getRightNode() != null;
                        temp = son, son = son.getLeftNode()
                        ) {
                        if (son != current.getLeftNode()){
                            temp.setRightNode(son.getLeftNode());
                            son.setLeftNode(root.getLeftNode());
                        }
                    }

                    son.setRightNode(root.getRightNode());
                    root = son;
                }

            }
            else if (current.getRightNode() == null){
                if (father.getLeftNode() == current){
                    father.setLeftNode(current.getLeftNode());
                }
                else{
                    father.setRightNode(current.getLeftNode());
                }
            }
            else if (current.getLeftNode() == null){
                if (father.getLeftNode() == current){
                    father.setLeftNode(current.getRightNode());
                }
                else{
                    father.setRightNode(current.getRightNode());
                }
            }
            else{
                for (
                        temp = current, son = current.getLeftNode();
                        son.getRightNode() != null;
                        temp = son, son = son.getRightNode()
                ){
                    if (son != current.getLeftNode()){
                        temp.setRightNode(son.getLeftNode());
                        son.setLeftNode(current.getLeftNode());
                    }
                    son.setRightNode(current.getRightNode());

                    if (father.getLeftNode() == current){
                        father.setLeftNode(son);
                    }
                    else {
                        father.setRightNode(son);
                    }
                }
            }
        }
        catch (NullPointerException e){
            System.out.println("Data not found. [CATCH]");
        }
    }
}
