package BinarySearchTree;

public class Lec3 {

    public static void main(String[] args) {
        System.out.println("Insertion in bst we know already recursion approach we did in the last lec1");
        BinaryTree binaryTree = new BinaryTree();
        int [] arr = {50,40,10,20,60,70,65,58,28,6,78,39,8,6,85,28};
        for(int val : arr){
            binaryTree.root = binaryTree.insert(binaryTree.root,val);
        }
        binaryTree.printTree(binaryTree.root,0);
        System.out.println(binaryTree.insertUsingIterativeApproach(binaryTree.root,5));

    }
}
