package interview;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * public class interview.LRUCache {
 * public interview.LRUCache(int capacity) {
 * <p>
 * }
 * <p>
 * public String get(String key) {
 * <p>
 * }
 * <p>
 * public void put(String key, String value) {
 * <p>
 * }
 * }
 */

// Zscalar
public class LRUCache {

    HashMap<String, String> cache = new HashMap<>();
    LinkedList<String> lruQueue = new LinkedList<>();

    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        lruCache.put("A", "Apple");
        lruCache.put("B", "Ball");
        lruCache.put("C", "Cat");
        lruCache.put("D", "Dog");
        lruCache.put("E", "Egg");

        System.out.println(lruCache.get("A"));

        lruCache.put("F", "Fun");
        System.out.println(lruCache.get("B"));
        System.out.println(lruCache.get("D"));
        System.out.println(lruCache.get("F"));

    }

    // b,c,d,a,
    public String get(String key) {
        remove(key);
        lruQueue.offer(key);

        if (!lruQueue.contains(key)) {
            cache.remove(key);
        }

        return cache.get(key);
    }

    public void put(String key, String value) {
        while (lruQueue.size() >= capacity) {
            cache.remove(lruQueue.poll());
        }
        remove(key);
        lruQueue.offer(key);
        cache.put(key, value);
    }

    void remove(String key) {
        lruQueue.remove(key);
    }
}

