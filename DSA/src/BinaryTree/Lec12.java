package BinaryTree;

public class Lec12 {
    public static void main(String[] args) {
        System.out.println("Preorder traversal using iterative approach");
        Node node = new Node();
        node = BinaryTree.createTree();
        BinaryTree.preOrderTraversalUsingIterative(node);


    }
}
