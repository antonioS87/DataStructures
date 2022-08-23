package maps;

public interface Map<K, V> {
    void clear();
    boolean containsKey();
    boolean containsValue();
    V get();
    void put(K key, V value);
    void remove(K key);
    boolean isEmpty();
    int size();
}
