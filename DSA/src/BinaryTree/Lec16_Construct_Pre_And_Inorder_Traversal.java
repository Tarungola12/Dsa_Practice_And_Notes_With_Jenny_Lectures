package BinaryTree;

public class Lec16_Construct_Pre_And_Inorder_Traversal {
    public static void main(String[] args) {
        System.out.println("In this video we will generate tree of preorder and inorder traversal");
//        Node root = BinaryTree.createTree();
//        BinaryTree.postOrderTraversal(root);
        int [] preOrder = {10,5,11,7,15,4};
        int [] inOrder = {5,11,10,4,15,7};
        Node root = BinaryTree.createTreeUsingPreorderAndInorderTraversal(preOrder,inOrder,0,0,preOrder.length-1);
        BinaryTree.inorderTraversal(root);
    }

}
