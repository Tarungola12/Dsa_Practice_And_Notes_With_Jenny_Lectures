package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lec17_Construct_Post_And_Inorder_Traversal {
    public static void main(String[] args) {
        int [] postOrder = {11,5,4,15,7,10};
        int [] inOrder = {5,11,10,4,15,7};
        int postIndex = postOrder.length-1;
        Node root = BinaryTree.createTreeUsingPostOrderAndInOrderTraversal(postOrder,inOrder,postIndex,0,postOrder.length-1);
        BinaryTree.postOrderTraversal(root);

    }
}
