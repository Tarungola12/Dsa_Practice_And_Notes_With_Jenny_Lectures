package AvlTrees;

public class Lec5_Deletion_In_Avl_Tree {
    public static void main(String[] args) {
        System.out.println("How to delete in avl tree there are 6 types are there : ");
        AvlTree avlTree = new AvlTree();
        int [] arr = {28,26,8,95,62,85,5,81,8,985,689,2,8,9,28,86,398,25,99,7,2};
        for(int val : arr) {
            avlTree.root = avlTree.insert(avlTree.root,val);
        }
        System.out.println(avlTree.delete(avlTree.root,5));

    }


}
