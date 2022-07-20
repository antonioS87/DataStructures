package antonios87.lists.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    public void testAddingElementsAndIndexExceptions(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(0);
        assertEquals(1, linkedList.getSize());
        assertEquals(0, linkedList.getLast());
        assertEquals(0, linkedList.getFirst());
        linkedList.addLast(1);
        assertEquals(2, linkedList.getSize());
        assertEquals(1, linkedList.getLast());
        assertEquals(0, linkedList.getFirst());
        linkedList.addLast(2);
        assertEquals(3, linkedList.getSize());
        assertEquals(2, linkedList.getLast());
        assertEquals(0, linkedList.getFirst());
        assertEquals(0, linkedList.get(0));
        assertEquals(1, linkedList.get(1));
        assertEquals(2, linkedList.get(2));

        Exception exception = assertThrows(IllegalArgumentException.class, () -> linkedList.get(4));
        assertEquals("Index greater than list size!", exception.getMessage());

        linkedList.insertAfter(3, 2);
        assertEquals(0, linkedList.get(0));
        assertEquals(1, linkedList.get(1));
        assertEquals(2, linkedList.get(2));
        assertEquals(3, linkedList.get(3));

        linkedList.insertAfter(4, 0);
        assertEquals(0, linkedList.get(0));
        assertEquals(4, linkedList.get(1));
        assertEquals(1, linkedList.get(2));
        assertEquals(2, linkedList.get(3));
        assertEquals(3, linkedList.get(4));

        exception = assertThrows(IllegalArgumentException.class, () -> linkedList.insertAfter(5, 6));
        assertEquals("Index out of bounds!", exception.getMessage());

    }

}