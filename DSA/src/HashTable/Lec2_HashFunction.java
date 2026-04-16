package HashTable;

public class Lec2_HashFunction {
    public static void main(String[] args) {
//        in this lecture mam tell us types of hash function and how to design a good hash function
//        there are four types of hash function :
//1. Division method : in this method we will take the key and divide it by the size
//        of the hash table and take the remainder as the hash value
//        hash(key) = key % size
//2. Multiplication method : in this method we will take the key and multiply it by a
//        constant value and take the fractional part of the result and multiply it by the size of the hash table
//        hash(key) = floor(size * (key * A % 1)) where A is a constant value between 0 and 1
//3. Mid square method : in this method we will take the key and square it and take
//        the middle part of the result as the hash value
//        hash(key) = (key * key) / 100 % size
//4. Folding method : in this method we will take the key and divide it into parts and
//        add the parts together and take the result as the hash value
//        hash(key) = (key / 1000) + (key % 1000) % size


        // properties of hash function :
        // 1. It should be easy to compute the hash value for any given key
        // 2. It should distribute the keys uniformly across the hash table
        // 3. It should minimize the number of collisions
        // 4. It should be deterministic, meaning that the same key should always produce the same hash

    }

}
