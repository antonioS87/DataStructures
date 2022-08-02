package antonios87.lists.doublylinked;

public class Node<T> {
    private T data;
    private Node next;
    private Node previous;

    public Node(T data){
        this.data = data;
    }

    public T data() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node next() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node previous() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
