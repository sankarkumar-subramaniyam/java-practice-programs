/**
 * 
 */
package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
//import java.util.HashMap.Node;
//import java.util.HashMap.TreeNode;

/**
 * @author Sankar
 *
 */
public class MyHashMap<K, V> implements Map<K, V> {
/*
	final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
		Node<K, V>[] tab;
		Node<K, V> p;
		int n, i;
		
		// initializing the table 
		if ((tab = table) == null || (n = tab.length) == 0)
			n = (tab = resize()).length;
		
		
		// (p = tab[i = (n - 1) & hash])
		if ((p = tab[i = (n - 1) & hash]) == null)
			tab[i] = newNode(hash, key, value, null);
		else {
			Node<K, V> e;
			K k;
			if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
				e = p;
			else if (p instanceof TreeNode)
				e = ((TreeNode<K, V>) p).putTreeVal(this, tab, hash, key, value);
			else {
				for (int binCount = 0;; ++binCount) {
					if ((e = p.next) == null) {
						p.next = newNode(hash, key, value, null);
						if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
							treeifyBin(tab, hash);
						break;
					}
					if (e.hash == hash && ((k = e.key) == key || (key != null && key.equals(k))))
						break;
					p = e;
				}
			}
			if (e != null) { // existing mapping for key
				V oldValue = e.value;
				if (!onlyIfAbsent || oldValue == null)
					e.value = value;
				afterNodeAccess(e);
				return oldValue;
			}
		}
		++modCount;
		if (++size > threshold)
			resize();
		afterNodeInsertion(evict);
		return null;
	}
*/
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
