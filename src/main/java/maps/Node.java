package maps;

public class Node<K,V> {
    final K key;
    V value;
    Node<K, V> next;

    public Node(K key, V value, Node<K, V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public void setNext(Node<K, V> next){
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setValue(V value){
        this.value = value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
