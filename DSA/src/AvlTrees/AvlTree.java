package AvlTrees;


import BinarySearchTree.BinaryTree;
import BinarySearchTree.Node;

public class AvlTree {
    NodeOfAvlTree root = null;

    public NodeOfAvlTree insert(NodeOfAvlTree node, int value) {
        if (node == null) return new NodeOfAvlTree(value);
        if (value < node.data) node.left = insert(node.left, value);
        if (value > node.data) node.right = insert(node.right, value);
        else return node;
        node.height = Math.max(height(node.left), height(node.right));
        int balance = getBalanceFactor(node);
//        LL CASE :
        if (balance > 1 && value < node.left.data) return rightRotation(node);
//        LR CASE :
        else if (balance > 1 && value > node.left.data) {
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
//        RR CASE :
        else if (balance < -1 && value > node.right.data) return leftRotation(node);
//        RL CASE :
        else if (balance < -1 && value < node.right.data) {
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }

    private NodeOfAvlTree rightRotation(NodeOfAvlTree node) {
        NodeOfAvlTree childNode = node.left;
        NodeOfAvlTree childNodeRightSubTree = childNode.right;
        childNode.right = node;
        node.left = childNodeRightSubTree;
        node.height = 1 + Math.max(height(node.left), (height(node.right)));
        childNode.height = 1 + Math.max(height(childNode.left), (height(childNode.right)));
        return childNode;
    }

    private NodeOfAvlTree leftRotation(NodeOfAvlTree node) {
        // x is root ka right
        NodeOfAvlTree x = node.right;
        // y is root ka right ka left wala subtree
        NodeOfAvlTree y = x.left;
        node.right = y;
        x.left = node;
        node.height = 1 + Math.max(height(node.left), (height(node.right)));
        x.height = 1 + Math.max(height(x.left), (height(x.right)));
        return x;
    }

    private int getBalanceFactor(NodeOfAvlTree node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    private int height(NodeOfAvlTree node) {
        if (node == null) {
            return 0;
        } else {
            return node.height;
        }
    }

    public NodeOfAvlTree delete(NodeOfAvlTree root, int value) {
        if (root == null) return null;
        if (value > root.data) root.right = delete(root.right, value);
        else if (value < root.data) root.left = delete(root.left, value);
        else {
            // CASE 1: when have no child
            if (root.left == null && root.right == null) return null;
//             CAse 2 : when have only right subtree
            else if (root.left == null) return root.right;
//            CAse 3 : when have only left subtree
            else if (root.right == null) return root.left;
//            case 4 : when have both right and left subtree
            else {
                NodeOfAvlTree inorderSuccessor = findInorderSuccessOfAvlTree(root.right);
                root.data = inorderSuccessor.data;
                root.right = delete(root.right, inorderSuccessor.data);
            }
        }
            root.height = Math.max(height(root.left), height(root.right));
            int balance = getBalanceFactor(root);

//        LL CASE :
            if (balance > 1 && getBalanceFactor(root.left) >= 0) return rightRotation(root);
//        LR CASE :
            else if (balance > 1 && getBalanceFactor(root.left) < 0) {
                root.left = leftRotation(root.left);
                return rightRotation(root);
            }
//        RR CASE :
            else if (balance < -1 && getBalanceFactor(root.right) <= 0) return leftRotation(root);
//        RL CASE :
            else if (balance < -1 && getBalanceFactor(root.left) > 0) {
                root.right = rightRotation(root.right);
                return leftRotation(root);
            }

        return root;
    }
        private NodeOfAvlTree findInorderSuccessOfAvlTree(NodeOfAvlTree node){
            if (node == null) {
                return null;
            }
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }
}
