package BinaryTree;

public class Lec7_InOrder_Recursive_Approach {
    public static void main(String[] args) {
        System.out.println("Inorder traversal implementation using recursive approach");
        System.out.println("See time and space complexity i don't write here");
        Node node = new Node();
        node = BinaryTree.createTree();
        BinaryTree.display(node,0);
        BinaryTree.inorderTraversal(node);

    }
}
