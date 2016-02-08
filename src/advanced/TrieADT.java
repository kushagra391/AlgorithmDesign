package advanced;/* Authored by Kushagra on 2/8/2016. */

import java.util.HashMap;

public class TrieADT {

    public static void main(String[] args) {
        Trie trie = new Trie();
    }


    private static class Trie {
        TrieRootNode root;

        Trie() {
            this.root = new TrieRootNode();
        }

        public void insertWord(String word) {

        }

        public boolean searchWord(String word) {


        }

        public void deleteWord(String word) {

        }

    }

    private static class TrieRootNode {
        HashMap<Character, TrieNode> childNodes;

        TrieRootNode() {
            childNodes = new HashMap<>();
        }
    }

    private static class TrieNode {

        char key;
        HashMap<Character, TrieNode> childNodes;

        TrieNode(char key) {
            this.key = key;
            childNodes = new HashMap<>();
        }

        public boolean isLeaf() {
            return this.childNodes.size() == 0;
        }
    }

}
