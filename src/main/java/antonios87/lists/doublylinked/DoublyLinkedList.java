package antonios87.lists.doublylinked;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private long size;

    public long size(){
        return size;
    }

    public void addFirst(T data){
        if(size == 0){
            this.head = new Node<>(data);
        } else {
            Node<T> newNode = new Node<>(data);
            newNode.setNext(this.head);
            this.head.setPrevious(newNode);
            this.head = newNode;
        }
        size++;
    }

    public T getFirst(){
        return this.head.data();
    }

    public T popFirst() {
        if (size == 0){
            return null;
        }

        T poppedData = this.head.data();
        if (size == 1){
            this.head = null;
        } else {
            this.head = this.head.next();
            this.head.setPrevious(null);
        }
        size--;

        return poppedData;
    }

    public void addLast(T data) {
        if(size == 0){
            this.head = new Node<>(data);
        } else {
            Node<T> newNode = new Node<>(data);
            Node<T> node = head;
            while(node.next() != null){
                node = node.next();
            }
            newNode.setPrevious(node);
            node.setNext(newNode);
        }
        size++;
    }

    public T getLast() {
        if (size == 1){
            return this.head.data();
        } else if (size > 1){
            Node<T> node = head;
            while(node.next() != null){
                node = node.next();
            }
            return node.data();
        }

        return null;
    }

    public void insertAfter(T data, long index){
        if(size < index + 1){
            throw new IllegalArgumentException("Index out of bounds!");
        }
        long i = 0;
        Node nodeBefore = head;
        while (i < index) {
            nodeBefore = nodeBefore.next();
            i++;
        }

        Node newNode = new Node(data);
        newNode.setNext(nodeBefore.next());
        newNode.setPrevious(nodeBefore);
        nodeBefore.setNext(newNode);
        size++;
    }

    public T get(long index){
        if(size < index){
            throw new IllegalArgumentException("Index greater than list size!");
        }

        Node<T> node = this.head;
        long i = 0;
        while(i < index){
            node = node.next();
            i++;
        }

        return node.data();
    }
}
