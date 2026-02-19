package BinaryTree;

public class Lec10 {
    public static void main(String[] args) {
        System.out.println("Leve order traversal using recursive approach");
        Node node = new Node();
        node = BinaryTree.createTree();
        BinaryTree.levelOrderTraversal(node);
    }
}
