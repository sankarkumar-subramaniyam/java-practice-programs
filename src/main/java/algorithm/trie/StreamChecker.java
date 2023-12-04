package algorithm.trie;

import java.util.*;

public class StreamChecker {

    TrieNode trie = new TrieNode();
    Deque<Character> stream = new ArrayDeque();

    public StreamChecker(String[] words) {
        for (String word : words) {
            TrieNode node = trie;
            String reversedWord = new StringBuilder(word).reverse().toString();
            for (char ch : reversedWord.toCharArray()) {
                if (!node.children.containsKey(ch)) {
                    node.children.put(ch, new TrieNode());
                }
                node = node.children.get(ch);
            }
            node.word = true;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>();
//        strs.add();

        String[] words = new String[]{"cd", "f", "kl"};
        StreamChecker streamChecker = new StreamChecker(words);
        streamChecker.query('a'); // return False
        streamChecker.query('b'); // return False
        streamChecker.query('c'); // return False
        streamChecker.query('d'); // return True, because 'cd' is in the wordlist
        streamChecker.query('e'); // return False
        streamChecker.query('f'); // return True, because 'f' is in the wordlist
        streamChecker.query('g'); // return False
        streamChecker.query('h'); // return False
        streamChecker.query('i'); // return False
        streamChecker.query('j'); // return False
        streamChecker.query('k'); // return False
        streamChecker.query('l'); // return True, because 'kl' is in the wordlist
    }

    public boolean query(char letter) {
        stream.addFirst(letter);

        TrieNode node = trie;
        for (char ch : stream) {
            if (node.word) {
                return true;
            }
            if (!node.children.containsKey(ch)) {
                return false;
            }
            node = node.children.get(ch);
        }
        return node.word;
    }

    class TrieNode {
        Map<Character, TrieNode> children = new HashMap();
        boolean word = false;
    }
}