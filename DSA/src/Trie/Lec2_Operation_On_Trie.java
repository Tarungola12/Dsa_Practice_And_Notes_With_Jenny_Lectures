package Trie;

public class Lec2_Operation_On_Trie {
    public static void main(String[] args) {
        System.out.println("In this lecture we will perform operation on trie");
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("mango");
        System.out.println(trie.search("app"));

    }
}
