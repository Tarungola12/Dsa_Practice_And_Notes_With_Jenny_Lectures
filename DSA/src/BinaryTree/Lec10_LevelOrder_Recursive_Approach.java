package BinaryTree;

public class Lec10_LevelOrder_Recursive_Approach {
    public static void main(String[] args) {
        System.out.println("Level order traversal using recursive approach");
        Node node = new Node();
        node = BinaryTree.createTree();
        BinaryTree.levelOrderTraversal(node);
    }
}
