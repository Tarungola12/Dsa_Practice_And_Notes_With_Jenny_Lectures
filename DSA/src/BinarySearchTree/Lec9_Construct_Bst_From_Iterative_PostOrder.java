package BinarySearchTree;

import java.util.Stack;

public class Lec9_Construct_Bst_From_Iterative_PostOrder {
    public static void main(String[] args) {
        System.out.println("Construct Bst Form PostOrder with iterative approach...");
        Stack<Node> stack = new Stack<>();
        int [] postOrder = {4,7,5,12,20,15,11,10};
        Node root = new Node(postOrder[postOrder.length-1]);
        stack.push(root);
        int i = postOrder.length-2;
        for(; i >= 0;i--){
            Node node = new Node(postOrder[i]);
            if(postOrder[i] > stack.peek().data) stack.peek().right = node;
            else {
                Node current = null;
                while (!stack.isEmpty() && postOrder[i] < stack.peek().data) current = stack.pop();
                current.left = node;
            }
            stack.push(node);
        }

        BinaryTree.printTree(root,0);
    }
}
