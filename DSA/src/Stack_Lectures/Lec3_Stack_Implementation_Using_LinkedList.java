package Stack_Lectures;
 public class Lec3_Stack_Implementation_Using_LinkedList {
     node top;
     int size = -1;

     public void push(int data) {
         node newNode = new node(data);
         newNode.nexNode = top;
         top = newNode;
         System.out.println("pushed succesfully.");
         size++;
         return;
     }

     public void traverseLinkedListStack() {

     }

     public void poo() {
         if (size == -1) {
             System.out.println("Can't pop.");
             return;
         }
         node temp = top;
         top = top.nexNode;
         System.out.println("Deleted element are : " + temp.data);
         temp.nexNode = null;
         size--;
     }
     public void peek(){
         node temp = top;
         if (size == -1) {
             System.out.println("Your stack is empty.");
             return;
         }
         System.out.println(top.data);
     }

     public static void main(String[] args) {
         // Stack implementation using linked list :
         Lec3_Stack_Implementation_Using_LinkedList obj = new  Lec3_Stack_Implementation_Using_LinkedList();
         obj.push(10);
         obj.push(20);
         obj.push(30);
         obj.push(40);
         obj.peek();
         // obj.poo();
         // obj.poo();
         // obj.poo();
         // obj.poo();

     }
 }

 class node {
     int data;
     node nexNode;

     node(int data) {
         this.data = data;
     }
 }

