package maps.hashmap;

import maps.Map;
import maps.Node;

public class HashMap<K,V> implements Map<K, V> {
    private Node<K,V>[] nodes;
    private static final int DEFAULT_CAPACITY = 16;
    private int capacity;
    private int size;

    public HashMap(){
        this(DEFAULT_CAPACITY);
    }

    public HashMap(int capacity){
        nodes = new Node[capacity];
        this.capacity = capacity;
    }

    @Override
    public void clear() {
        nodes = new Node[capacity];
        size = 0;
    }

    @Override
    public boolean containsKey(K key) {
        return this.get(key) != null;
    }

    @Override
    public boolean containsValue(V value) {
        for(int i = 0; i < capacity; i++){

            Node<K, V> node = nodes[i];
            while(node != null && !node.getValue().equals(value)){
                node = node.getNext();
            }

            if(node != null){
                return true;
            }
        }
        return false;
    }

    @Override
    public V get(K key) {
        int position = getPosition(key);

        Node<K, V> node = nodes[position];
        while(node != null && node.getKey() != key){
            node = node.getNext();
        }

        if(node != null){
            return node.getValue();
        } else {
            return null;
        }

    }

    @Override
    public void put(K key, V value) {
        int position = getPosition(key);

        Node<K, V> newNode = new Node<>(key, value, null);

        if (nodes[position] == null) {
            nodes[position] = newNode;
            size++;
        } else {
            Node<K, V> node = nodes[position];
            if(node.getKey() == key){
                newNode.setNext(nodes[position].getNext());
                nodes[position] = newNode;
            } else {
                while(node.getNext() != null && node.getNext().getKey() != key){
                    node = node.getNext();
                }

                if(node.getNext() == null){
                    node.setNext(newNode);
                    size++;
                } else {
                    newNode.setNext(node.getNext().getNext());
                    node.setNext(newNode);
                }

            }
        }
    }

    @Override
    public String toString() {
        String mapString = "";
        for(int i = 0; i < capacity; i++){
            Node<K, V> node = nodes[i];
            mapString = mapString + " [";
            while(node != null){
                mapString = mapString  + node.getKey() + ":" + node.getValue() + ", ";
                node = node.getNext();
            }

            mapString = mapString + "]; ";
        }
        return mapString;
    }

    @Override
    public void remove(K key) {
        int position = getPosition(key);

        if (nodes[position] != null) {
            Node<K, V> node = nodes[position];
            if(node.getKey() == key){
                nodes[position] = nodes[position].getNext();
                size--;
            } else {
                while(node.getNext() != null && node.getNext().getKey() != key){
                    node = node.getNext();
                }
                if(node.getNext() != null){
                    node.setNext(node.getNext().getNext());
                    size--;
                }
            }
        }
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public int getPosition(K key){
        int position = key.hashCode() % capacity;
        position = position < 0 ? position * -1 : position;

        return position;
    }
}
