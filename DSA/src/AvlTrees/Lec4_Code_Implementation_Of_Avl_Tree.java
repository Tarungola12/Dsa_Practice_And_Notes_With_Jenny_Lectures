package AvlTrees;

public class Lec4_Code_Implementation_Of_Avl_Tree {
    public static void main(String[] args) {
        System.out.println("In this lecture we do code implementation of avl tree.");

    }
}

class AvlTree{
    public Node insert(Node node,int value){
        if(node == null) return new Node(value);
        if(value < node.data) node.left = insert(node.left,value);
        if(value > node.data) node.right = insert(node.right,value);
        else return node;
        node.height = Math.max(height(node.left),height(node.right));
        int balance = getBalanceFactor(node);
//        LL CASE :
        if(balance > 1 && value < node.left.data) return rightRotation(node);
//        LR CASE :
        else if(balance > 1 && value > node.left.data) {
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
//        RR CASE :
        else if(balance < -1 && value > node.right.data) return leftRotation(node);
//        RL CASE :
        else if(balance < -1 && value < node.right.data) {
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }

    private Node rightRotation(Node node) {
        Node childNode = node.left;
        Node childNodeRightSubTree = childNode.right;
        childNode.right = node;
        node.left = childNodeRightSubTree;
        node.height = 1+Math.max(height(node.left),(height(node.right)));
        childNode.height = 1+Math.max(height(childNode.left),(height(childNode.right)));
        return childNode;
    }

    private Node leftRotation(Node node) {
        // x is root ka right
        Node x = node.right;
        // y is root ka right ka left wala subtree
        Node y = x.left;
        node.right = y;
        x.left = node;
        node.height = 1+Math.max(height(node.left),(height(node.right)));
        x.height = 1+Math.max(height(x.left),(height(x.right)));
        return x;
    }

    private int getBalanceFactor(Node node) {
        if(node == null) return 0;
        return height(node.left)-height(node.right);
    }

    private int height(Node node) {
        if(node == null){
            return 0;
        }else{
            return node.height;
        }
    }
}

class Node{
    int data;
    Node left;
    Node right;
    int height=1;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node left, Node right, int height) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.height = height;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}