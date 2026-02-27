package BinarySearchTree;

public class Lec1_Intro_And_Creation_Of_Bst {
    public static void main(String[] args) {
        System.out.println("Only how to generate binary tree and print it...");
        BinaryTree binaryTree = new BinaryTree();
//        int [] arr = {10,60,52,0,4,20,20,28,21,830,92,86,58,600,4,36};
        int [] arr = {50,40,10,20,60,70,65};
        for(int val : arr){
            binaryTree.root = binaryTree.insert(binaryTree.root,val);
        }
        binaryTree.printTree(binaryTree.root,0);
    }
}

