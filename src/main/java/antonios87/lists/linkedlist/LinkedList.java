package antonios87.lists.linkedlist;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> end;
    private long size;

    public void addLast(T data){
        Node<T> newLastNode = new Node<>(data);
        if(this.size == 0){
            this.head = newLastNode;
            this.end = newLastNode;
        } else if (this.size == 1){
            this.end = newLastNode;
            this.head.setNext(newLastNode);
        } else {
            this.end.setNext(newLastNode);
            this.end = newLastNode;
        }
        size++;
    }

    public long getSize(){
        return this.size;
    }

    public T getLast(){
        return this.end.getData();
    }

    public T getFirst(){
        return this.head.getData();
    }

    public T get(long index){
        if(size < index){
            throw new IllegalArgumentException("Index greater than list size!");
        }

        Node<T> node = this.head;
        long i = 0;
        while(i < index){
            node = node.getNext();
            i++;
        }

        return node.getData();
    }

    public void insertAfter(T data, long index){
        if(size < index + 1){
            throw new IllegalArgumentException("Index out of bounds!");
        }
        int i = 0;
        Node nodeBefore = head;
        while (i < index) {
            nodeBefore = nodeBefore.getNext();
            i++;
        }

        Node newNode = new Node(data);
        newNode.setNext(nodeBefore.getNext());
        nodeBefore.setNext(newNode);
        size++;
    }
}
