package algorithm.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// https://leetcode.com/problems/search-suggestions-system/?envType=study-plan-v2&envId=leetcode-75
// https://leetcode.com/problems/design-search-autocomplete-system/
public class SuggestedProductsWithTrie {


    public static void main(String[] args) {
        SuggestedProductsWithTrie suggestedProductsWithTrie = new SuggestedProductsWithTrie();
        List<List<String>> result = suggestedProductsWithTrie.suggestedProducts(
                new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"},
                "mouse");
        System.out.println(result);
    }

    List<List<String>> suggestedProducts(String[] products,
                                         String searchWord) {
        Trie trie = new Trie();
        List<List<String>> result = new ArrayList<>();
        // Add all words to trie.
        for (String w : products)
            trie.insert(w);
        String prefix = "";
        for (char c : searchWord.toCharArray()) {
            prefix += c;
            result.add(trie.getWordsStartingWith(prefix));
        }
        return result;
    }

    // Custom class Trie with function to get 3 words starting with given prefix
    class Trie {

        Node Root, curr;
        List<String> resultBuffer;

        Trie() {
            Root = new Node();
        }

        // Runs a DFS on trie starting with given prefix and adds all the words in the resultBuffer, limiting result size to 3
        void dfsWithPrefix(Node curr, String word) {
            if (resultBuffer.size() == 3)
                return;
            if (curr.isWord)
                resultBuffer.add(word);

            // Run DFS on all possible paths.
            for (char c = 'a'; c <= 'z'; c++)
                if (curr.children.get(c - 'a') != null)
                    dfsWithPrefix(curr.children.get(c - 'a'), word + c);
        }

        // Inserts the string in trie.
        void insert(String s) {

            // Points curr to the root of trie.
            curr = Root;
            for (char c : s.toCharArray()) {
                if (curr.children.get(c - 'a') == null)
                    curr.children.set(c - 'a', new Node());
                curr = curr.children.get(c - 'a');
            }

            // Mark this node as a completed word.
            curr.isWord = true;
        }

        List<String> getWordsStartingWith(String prefix) {
            curr = Root;
            resultBuffer = new ArrayList<>();
            // Move curr to the end of prefix in its trie representation.
            for (char c : prefix.toCharArray()) {
                if (curr.children.get(c - 'a') == null)
                    return resultBuffer;
                curr = curr.children.get(c - 'a');
            }
            dfsWithPrefix(curr, prefix);
            return resultBuffer;
        }

        // Node definition of a trie
        class Node {
            boolean isWord = false;
            List<Node> children = Arrays.asList(new Node[26]);
        }
    }

}

