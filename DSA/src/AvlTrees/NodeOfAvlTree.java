package AvlTrees;

public class NodeOfAvlTree {
        int data;
        NodeOfAvlTree left;
        NodeOfAvlTree right;
        int height=1;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeOfAvlTree getLeft() {
        return left;
    }

    public void setLeft(NodeOfAvlTree left) {
        this.left = left;
    }

    public NodeOfAvlTree getRight() {
        return right;
    }

    public void setRight(NodeOfAvlTree right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public NodeOfAvlTree(int data) {
        this.data = data;
    }

    public NodeOfAvlTree() {
    }
}
