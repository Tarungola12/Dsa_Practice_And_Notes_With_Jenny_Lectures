package BinarySearchTree;

public class Lec5_Construct_Bst_From_PreOrder {
    public static void main(String[] args) {
        System.out.println("Construct bst from preorder there are 3 ways to create it : 1 is normally when we create binary tree using inorder and preorder 2 ways is : i write code and 3rd way is wirte a code :");
        int [] preOrder = {10,5,4,7,11,15,12,20,18};
        // take n2 way 1 and 2 but 3 way is taken only n.
        Node root = BinaryTree.createBstFromPreOrderWay2(preOrder,0,preOrder.length-1);
        Node root2 = BinaryTree.createBstFromPreOrderWay3(preOrder,0,Integer.MAX_VALUE);
        // TODO : we can do with iteratively try out with myself.
//        BinaryTree.printTree(root,0);
        BinaryTree.printTree(root2,0);
    }
}
