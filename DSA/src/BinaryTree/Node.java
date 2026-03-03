package BinaryTree;

public class Node {
    int data;
    Node leftNode;
    Node rightNode;

    public Node() {
    }

    public Node(int data, Node leftNode, Node rigNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rigNode;
    }

    public Node(int data) {
        this.data = data;
    }


}
