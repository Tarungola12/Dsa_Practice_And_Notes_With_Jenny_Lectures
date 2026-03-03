package BinaryTree;

public class Lec13_InOrderTraversal_Iterative_Approach {
    public static void main(String[] args) {
        System.out.println("In this lecture we will study of inorder traversal using iterative approach");
        Node node = new Node();
        node = BinaryTree.createTree();
        BinaryTree.inorderTraversalUsingIterative(node);
    }
}
