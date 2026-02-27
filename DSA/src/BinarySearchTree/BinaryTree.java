package BinarySearchTree;

public class BinaryTree{
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
