package LinkedList;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}

public class Lec1_Introduction_To_Linked_List {
    public static void main(String[] args) {
        // Why we need linkedlist 
        // What is limitation of array and arraylist
        // how we create linked list
        node head = new node(5);
        System.out.println(head.data);
    }    
}
