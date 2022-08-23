package antonios87.lists.doublylinked;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void size() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(1);
        assertEquals(1, list.size());
        list.addFirst(0);
        assertEquals(2, list.size());
        list.addFirst(3);
        assertEquals(3, list.size());
        list.popFirst();
        assertEquals(2, list.size());
        list.popFirst();
        assertEquals(1, list.size());
        list.popFirst();
        assertEquals(0, list.size());
        list.popFirst();
        assertEquals(0, list.size());
    }

    @Test
    void addFirst() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(2);
        assertEquals(2, list.getFirst());
        list.addFirst(1);
        assertEquals(1, list.getFirst());
        list.addFirst(0);
        assertEquals(0, list.getFirst());
    }

    @Test
    void popFirst(){
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addFirst(0);
        assertEquals(0, list.popFirst());
        list.addFirst(1);
        list.addFirst(0);
        assertEquals(0, list.popFirst());
        assertEquals(1, list.popFirst());
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        assertEquals(0, list.popFirst());
        assertEquals(1, list.popFirst());
        assertEquals(2, list.popFirst());
        assertEquals(null, list.popFirst());
    }

    @Test
    void addLastGetLast(){
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addLast(0);
        assertEquals(1, list.size());
        assertEquals(0, list.getLast());
        list.addLast(1);
        assertEquals(2, list.size());
        assertEquals(1, list.getLast());
        list.addLast(2);
        assertEquals(3, list.size());
        assertEquals(2, list.getLast());
    }

    @Test
    void insertAfterTest(){
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addLast(0);
        assertEquals(1, list.size());
        assertEquals(0, list.getLast());
        list.addLast(1);
        assertEquals(2, list.size());
        assertEquals(1, list.getLast());
        list.insertAfter(2, 0);
        assertEquals(3, list.size());
        assertEquals(0, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(1, list.get(2));

        list.insertAfter(3, list.size()-1);
        assertEquals(4, list.size());
        assertEquals(0, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(1, list.get(2));
        assertEquals(3, list.get(3));
    }

    @Test
    void insertBeforeTest(){
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addLast(0);
        assertEquals(1, list.size());
        assertEquals(0, list.getLast());
        list.insertBefore(1, 0);
        assertEquals(2, list.size());
        assertEquals(1, list.get(0));
        assertEquals(0, list.get(1));

    }


}