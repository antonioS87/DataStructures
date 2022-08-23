package maps;

public interface Map<K, V> {
    void clear();
    boolean containsKey(K key);
    boolean containsValue(V value);
    V get(K key);
    void put(K key, V value);
    void remove(K key);
    boolean isEmpty();
    int size();
}
