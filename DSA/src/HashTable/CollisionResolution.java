package HashTable;

import java.util.Arrays;

public class CollisionResolution {

    public static int hashFunction(int key,int size) {
        return key % size; // simple hash function for demonstration
    }

    static class LinearProbing {
        // In linear probing we will check the next index if the index is already occupied
        // and we will keep checking the next index until we find an empty index
        Node [] hashTable;
        int size;

        public LinearProbing(int size) {
            hashTable = new Node[size];
            this.size = size;
            Arrays.fill(hashTable, null);
        }

        public void insert(int key) {
            int index = hashFunction(key, size);
            while (hashTable[index] != null) {
                index = (index + 1) % size; // move to the next index
            }
            hashTable[index] = new Node(key);
        }

    }
}
