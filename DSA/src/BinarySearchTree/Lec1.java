package BinarySearchTree;

public class Lec1 {
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

class BinaryTree{
    Node root = null;

    public Node insert(Node node,int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value <= node.data){
            node.left = insert(node.left,value);
        }else{
            node.right = insert(node.right,value);
        }
        return node;
    }

    public void printTree(Node node,int level){
        if(node == null){
            return;
        }
        printTree(node.right,++level);
        for(int i = 0;i < level;i++){
            System.out.print("-----");
        }
        System.out.println(node.data);
        printTree(node.left,level);
    }

    public boolean searchInTree(Node root, int value) {
        if(root == null){
            return false;
        }
        if(root.data == value){
            return true;
        }
        while(root!=null){
            if(value == root.data) {
                return true;
            }
            if(value < root.data){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return false;
    }

    public boolean searchInTreeUsingRecursiveApproach(Node root,int value){
        if(root == null){
            return false;
        }
        if(root.data == value){
            return true;
        }
        if(value > root.data){
            return searchInTreeUsingRecursiveApproach(root.right,value);
        }else {
            return searchInTreeUsingRecursiveApproach(root.left,value);
        }
    }


    public boolean insertUsingIterativeApproach(Node root, int value) {
        System.out.println("Duplicates is not allowed in this method");
        if(root == null){
            return false;
        }
        Node prevNode = root;
        while(root != null){
            prevNode = root;
            if(root.data == value) return false;
            if(value < root.data) root = root.left;
            else root = root.right;

        }
        Node node = new Node(value);
        if(prevNode.data < value){
            prevNode.right = node;
            return true;
        }
        prevNode.left = node;
        return true;
    }

    public Node deleteionInBst(Node root, int value) {
        if(root == null) return null;
        if(value > root.data) root.right = deleteionInBst(root.right,value);
        else if(value < root.data) root.left =  deleteionInBst(root.left,value);
        else {
            if(root.left == null && root.right == null) return null;
            else if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else{
                Node tmp = findInorderSuccessor(root.right);
                root.data= tmp.data;
                return deleteionInBst(root.right,tmp.data);
            }
        }
        return root;
    }

    private Node findInorderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
}

class Node{
    int data;
    Node right;
    Node left;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node(int data) {
        this.data = data;
    }

    public Node() {
    }

    public Node(int data, Node right, Node left) {
        this.data = data;
        this.right = right;
        this.left = left;
    }
}