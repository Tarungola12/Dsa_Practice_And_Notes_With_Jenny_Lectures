package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {

    static Scanner sc = new Scanner(System.in);

    public static Node createTree() {
        System.out.println("Enter the data : ");
        int value = sc.nextInt();
        if (value == -1) {
            return null;
        }
        Node newNode = new Node(value);
        System.out.println("Node of " + value + " is created");

        System.out.println("Do you want left child of value enter t for yes: " + value);
        sc.nextLine();
        String left = sc.nextLine();
        if (left.charAt(0) == 't' || left.charAt(0) == 'T' || left == "true" || left == "True" || left.charAt(0) == 'y'
                || left == "yes") {
            System.out.println("left child is created");
            newNode.leftNode = createTree();
        }
        System.out.println("You want right child of value : " + value);
        String right = sc.nextLine();
        if (right.charAt(0) == 't' || right.charAt(0) == 'T' || right == "true" || right == "True"
                || right.charAt(0) == 'y'
                || right == "yes") {
            System.out.println("right child is created");
            newNode.rightNode = createTree();
        }
        return newNode;
    }

    public static void display(Node root, int level) {
        if (root == null) {
            return ;
        }
        display(root.rightNode, ++level);
        for (int i = 0; i < level; i++) {
            System.out.print("-----");
        }
        System.out.println(root.data);
        display(root.leftNode, ++level);
    }

    public static void inorderTraversal(Node node){
        if(node == null) return ;
        inorderTraversal(node.leftNode);
        System.out.print(node.data+",");
        inorderTraversal(node.rightNode);
    }

    public static void preOrderTraversal(Node root) {
        if(root == null) return;
        System.out.print(root.data+",");
        preOrderTraversal(root.leftNode);
        preOrderTraversal(root.rightNode);
    }

    public static void postOrderTraversal(Node root) {
        if(root == null) return;
        postOrderTraversal(root.leftNode);
        postOrderTraversal(root.rightNode);
        System.out.print(root.data+",");
    }

    public static void levelOrderTraversal(Node node) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node newNode = queue.remove();
            System.out.println(newNode.data);
            if(newNode.leftNode != null) queue.add(newNode.leftNode);
            if(newNode.rightNode != null) queue.add(newNode.rightNode);
        }

    }

    public static void preOrderTraversalUsingIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        while(root!=null||!stack.isEmpty()){
            if(root != null){
                System.out.print(root.data+",");
                stack.push(root);
                root = root.leftNode;
            }else{
                root = stack.pop();
                root = root.rightNode;
            }
        }
    }

    public static void inorderTraversalUsingIterative(Node node){
        Stack<Node> stack = new Stack<>();
        while(node!=null||!stack.isEmpty()){
            if(node != null){
                stack.push(node);
                node = node.leftNode;
            }else{
                node = stack.pop();
                System.out.print(node.data+",");
                node = node.rightNode;
            }
        }

    }


    public static void postOrderTraversalUsingIterative(Node node){
        Stack<Node> stack = new Stack<>();
        while(node!=null||!stack.isEmpty()){
            if(node != null){
                stack.push(node);
                node = node.leftNode;
            }else{
                node = stack.peek();
                node = node.rightNode;
            }
        }
    }

}
