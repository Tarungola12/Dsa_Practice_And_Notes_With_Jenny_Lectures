package BinarySearchTree;

public class Lec1 {
    public static void main(String[] args) {
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