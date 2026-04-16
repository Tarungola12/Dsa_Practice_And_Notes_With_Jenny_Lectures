package HashTable;

public class Lec3_CollisionResolutionTechnique_SeparateChaining {
    public static void main(String[] args) {
        System.out.println("In this lecture we will understand the collision resolution technique separate chaining");

//        there are two type of collision resolution technique

        // 1. Open Hashing or Direct Chaining :
//                in this technique we will use the linked list to store the element in the same index
//                if there is a collision then we will add the element in the linked list of that index


        // 2. Closed Hashing or Open Addressing : there are three type of open addressing technique
        // i. Linear Probing
        // ii. Quadratic Probing
        // iii. Double Hashing

        // we will see the implementation of separate chaining in the next lecture

        HashTable hashTable = new HashTable(5);
        hashTable.insert(12);
        hashTable.insert(1);
        hashTable.insert(22);
//        hashTable.insert(15);
        hashTable.display();
        System.out.println("-----------------------------------");
        hashTable.insert(17);
        hashTable.display();
        System.out.println(hashTable.search(12));
        hashTable.delete(12);
        hashTable.display();

    }
}


