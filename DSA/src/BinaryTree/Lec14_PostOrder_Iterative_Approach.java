package BinaryTree;

public class Lec14_PostOrder_Iterative_Approach {
    public static void main(String[] args) {
        System.out.println("In this lecture we will do post order traversal using iterative approach");
        Node node = new Node();
        node = BinaryTree.createTree();

        BinaryTree.postOrderTraversalUsingIterative(node);
    }
}
