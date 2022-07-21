package antonios87.lists.linkedlist;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> end;
    private long size;

    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        if (this.size == 0){
            this.end = newNode;
        }
        newNode.setNext(this.head);
        this.head = newNode;
        size++;
    }

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

    public void removeFirst(){
        if(size == 1){
            this.head = null;
            this.end = null;
            size--;
        } else if (size > 1){
            this.head = this.head.getNext();
            size--;
        }
    }

    public void removeLast(){
        if(size == 1){
            this.head = null;
            this.end = null;
            size--;
        } else if (size > 1){
            Node node = head;
            while(node.getNext().getNext() != null){
                node = node.getNext();
            }
            node.setNext(null);
            this.end = node;
            size--;
        }
    }

    public void removeAtIndex(long index){
        if(size < index -1 || size == 0){
            throw new IllegalArgumentException("Index out of bounds!");
        }

        if(size == 1){
            this.head = null;
            this.end = null;
        } else if(size == 2){
            if(index == 0){
                this.head = head.getNext();
            }
            this.end = this.head;
        } else {
            Node node = head;
            long i = 0;
            while(i < index - 1){
                node = node.getNext();
            }
            node.setNext(node.getNext().getNext());
        }
        size--;
    }

    public void clear(){
        this.head = null;
        this.end = null;
        this.size = 0;
    }

    public long getSize(){
        return this.size;
    }

    public T getLast(){
        if(end == null) {
            return null;
        }

        return this.end.getData();
    }

    public T getFirst(){
        if(head == null){
            return null;
        }
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
}
