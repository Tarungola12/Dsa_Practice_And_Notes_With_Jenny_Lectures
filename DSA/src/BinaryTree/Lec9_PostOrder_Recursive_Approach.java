package BinaryTree;

public class Lec9_PostOrder_Recursive_Approach {
    public static void main(String[] args) {
        System.out.println("Post order traversal using recursive approach");
        Node node = new Node();
        node = BinaryTree.createTree();
        BinaryTree.postOrderTraversal(node);
    }
}
