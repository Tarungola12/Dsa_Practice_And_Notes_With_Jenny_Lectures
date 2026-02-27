package BinaryTree;

public class Lec12_PreOrder_Iterative_Approach {
    public static void main(String[] args) {
        System.out.println("Preorder traversal using iterative approach");
        Node node = new Node();
        node = BinaryTree.createTree();
        BinaryTree.preOrderTraversalUsingIterative(node);


    }
}
