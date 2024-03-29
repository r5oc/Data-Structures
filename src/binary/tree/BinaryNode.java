package binary.tree;

public class BinaryNode<T>{
    private T data;
    private BinaryNode<T> leftNode;
    // node com objeto do tipo generico dentro
    private BinaryNode<T> rightNode;

    public BinaryNode(T data){
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public BinaryNode() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "data=" + data +
                '}';
    }
}
