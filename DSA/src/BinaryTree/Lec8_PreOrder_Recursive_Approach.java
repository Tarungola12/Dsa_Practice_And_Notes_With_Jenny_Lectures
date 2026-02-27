package BinaryTree;

public class Lec8_PreOrder_Recursive_Approach {
    public static void main(String[] args) {
        System.out.println("PreOrderTraversal using recursive approach");
        Node node = new Node();
        node = BinaryTree.createTree();
        BinaryTree.preOrderTraversal(node);
    }
}
