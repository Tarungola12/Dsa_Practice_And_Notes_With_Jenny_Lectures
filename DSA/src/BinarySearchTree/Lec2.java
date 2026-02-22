package BinarySearchTree;

public class Lec2 {

    public static void main(String[] args) {
        System.out.println("Searching in bst");
        BinaryTree binaryTree = new BinaryTree();
        int [] arr = {50,40,10,20,60,70,65,58,28,6,78,39,8,6,85,28};
        for(int val : arr){
            binaryTree.root = binaryTree.insert(binaryTree.root,val);
        }
        binaryTree.printTree(binaryTree.root,0);
        System.out.println(binaryTree.searchInTree(binaryTree.root,28));

    }

}
