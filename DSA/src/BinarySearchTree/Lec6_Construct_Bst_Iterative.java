package BinarySearchTree;

import java.util.Stack;

public class Lec6_Construct_Bst_Iterative {
    public static void main(String[] args) {
        System.out.println("Construct bst from preorder using iterative approach.");
        Stack<Node> stack = new Stack<>();
        int [] preOrder = {10,5,4,7,11,15,12,20,18};
        Node root = new Node(preOrder[0]);
        stack.push(root);
//        int value = 1;
//        while(!stack.isEmpty()){
//            if(stack.peek().data > preOrder[value]){
//                root.left = new Node(preOrder[value]);
//                root = root.left;
//                stack.push(root);
//            }else{
//                while(!stack.isEmpty() || ){
//                    root = stack.pop();
//                    if(root.data < stack.peek()){
//                        
//                    }
//                }
//                root = stack.pop();
//                root.right = new Node(preOrder[value]);
//            }
//            value++;
//        }

        for(int i = 1;i < preOrder.length;i++){
            Node newNode = new Node(preOrder[i]);
            if(newNode.data < stack.peek().data){
                stack.peek().left = newNode;
            }else {
                Node parent = null;
                while (!stack.isEmpty() && preOrder[i] > stack.peek().data){
                         parent = stack.pop();
                }
                parent.right = newNode;
            }
            stack.push(newNode);
        }
        BinaryTree.printTree(root,0);
    }

}
