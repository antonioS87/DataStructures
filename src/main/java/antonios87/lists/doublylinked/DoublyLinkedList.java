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
}
