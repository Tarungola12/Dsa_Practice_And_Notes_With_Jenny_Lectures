package HashTable;

public class HashTable {
    int size;
    Node[] hashTable;
    final double LOAD_FACTOR_THRESHOLD = 0.75;
    int count;

    public HashTable(int size) {
        hashTable = new Node[size];
        this.size = size;
        count = 0;
    }

    private double calculateLoadFactor() {
        return (double) count / size;
    }

    public void insert(int key) {
        int index = hashFunction(key);
        Node newNode = new Node(key);
        newNode.next = hashTable[index];
        hashTable[index] = newNode;
        count++;
        if (calculateLoadFactor() > LOAD_FACTOR_THRESHOLD) rehash();
    }

    private void rehash() {
        Node [] oldHashTable = hashTable;
        int oldSize = size;
        size = size * 2;
        hashTable = new Node[size];
        count = 0;
        for (int i = 0; i < oldSize; i++) {
            Node temp = oldHashTable[i];
            while (temp != null) {
                insert(temp.key);
                temp = temp.next;
            }
        }
    }

    public boolean search(int key) {
        int index = hashFunction(key);
        Node temp = hashTable[index];
        while (temp != null) {
            if (temp.key == key) return true;
            temp = temp.next;
        }
        return false;
    }

    public void delete(int key) {
        int index = hashFunction(key);
        Node temp = hashTable[index];
        Node prev = null;
        while (temp != null) {
            if (temp.key == key) {
                if (prev == null) {
                    hashTable[index] = temp.next;
                } else {
                    prev.next = temp.next;
                }
                count--;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            Node temp = hashTable[i];
            System.out.print(i+" -> ");
            while (temp != null) {
                System.out.print(temp.key + ",");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    private int hashFunction(int key) {
        return key % size;
    }

}

class Node {
    int key;
    Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}
