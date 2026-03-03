package BinaryTree;

import java.util.Stack;

public class BinaryTree2 {

    public static Node create() {
        Node node = new Node(10);
        Node node1 = new Node(5);
        Node node2 = new Node(13);
        Node node3 = new Node(3);
        Node node4 = new Node(7);
        Node node5 = new Node(12);
        Node node6 = new Node(15);

        node.leftNode = node1;
        node.rightNode = node2;

        node1.leftNode = node3;
        node1.rightNode = node4;

        node2.leftNode = node5;
        node2.rightNode = node6;
        return node;

    }

    public static void preOrder() {
//        root -> left -> right
        Node root = create();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            System.out.println(root.data);
            if(root.leftNode != null) {
                stack.push(root.leftNode);
                root = root.leftNode;
            }else {
                stack.push(root.rightNode);
                root = root.rightNode;
            }
        }


    }

}
