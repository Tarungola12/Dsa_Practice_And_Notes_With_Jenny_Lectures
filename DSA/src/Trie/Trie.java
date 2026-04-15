package Trie;

public class Trie {

    StructureOfTrie trie;

    public Trie(){
        trie = new StructureOfTrie();
    }

    public void insert(String word) {
        StructureOfTrie temp = trie;
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(temp.structureOfTrie[index] == null) temp.structureOfTrie[index] = new StructureOfTrie();
            temp = temp.structureOfTrie[index];
        }
        temp.isEndOfWord = true;
    }




}

class StructureOfTrie {
    StructureOfTrie[] structureOfTrie;
    boolean isEndOfWord;

    public StructureOfTrie() {
        structureOfTrie = new StructureOfTrie[26];
        isEndOfWord = false;
    }

}
