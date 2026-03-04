package BinaryTree;

public class Lec20_SameTree_100 {
    public static void main(String[] args) {
        System.out.println("Leet code question 100");
        int [] postOrder = {11,5,4,15,7,10};
        int [] inOrder = {5,11,10,4,15,7};

        int postIndex = postOrder.length-1;

        int [] postOrder2 = {11,5,4,55,7,10};
        int [] inOrder2 = {5,11,10,4,55,7};

        Node root = BinaryTree.createTreeUsingPostOrderAndInOrderTraversal(postOrder,inOrder,postIndex,0,postOrder.length-1);


        Node rootsame = BinaryTree.createTreeUsingPostOrderAndInOrderTraversal(postOrder,inOrder,postIndex,0,postOrder.length-1);
        Node root2 = BinaryTree.createTreeUsingPostOrderAndInOrderTraversal(postOrder2,inOrder2,postIndex,0,postOrder2.length-1);
        System.out.println(BinaryTree.compare(root,root2));
    }
}
