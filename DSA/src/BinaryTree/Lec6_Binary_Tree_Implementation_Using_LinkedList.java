package BinaryTree;
import java.util.*;

public class Lec6_Binary_Tree_Implementation_Using_LinkedList {

    public static void main(String[] args) {
        System.out.println("Binary Tree Implementation using linked list");

         Node rootNode = BinaryTree.createTree();
         System.out.println("The root element data is : " + rootNode.data);
         BinaryTree.display(rootNode, 0);
    }
}

