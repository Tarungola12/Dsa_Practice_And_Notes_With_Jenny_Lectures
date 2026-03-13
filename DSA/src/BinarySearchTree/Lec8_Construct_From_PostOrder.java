package BinarySearchTree;

public class Lec8_Construct_From_PostOrder {
    public static void main(String[] args) {
        System.out.println("Construct Bst from postorder");
        int [] postOrder = {4,7,5,12,20,15,11,10};

        Node root2 = BinaryTree.createBstFromPostOrderWay2(postOrder,0,postOrder.length-1);
        BinaryTree.printTree(root2,0);

        System.out.println("=========================================");

        Node root = BinaryTree.createBstFromPostOrderWay3(postOrder,postOrder.length-1,Integer.MIN_VALUE);
        BinaryTree.printTree(root,0);
    }
}
