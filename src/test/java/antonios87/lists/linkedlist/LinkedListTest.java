package antonios87.lists.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    public void testAddLastGetAndExceptionIfIndexOutOfBounds(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        assertEquals(1, linkedList.getSize());
        assertEquals(1, linkedList.getLast());
        assertEquals(1, linkedList.getFirst());
        linkedList.addLast(2);
        assertEquals(2, linkedList.getSize());
        assertEquals(2, linkedList.getLast());
        assertEquals(1, linkedList.getFirst());
        linkedList.addLast(3);
        assertEquals(3, linkedList.getSize());
        assertEquals(3, linkedList.getLast());
        assertEquals(1, linkedList.getFirst());
        assertEquals(1, linkedList.get(0));
        assertEquals(2, linkedList.get(1));
        assertEquals(3, linkedList.get(2));

        Exception exception = assertThrows(IllegalArgumentException.class, () -> linkedList.get(4));
        assertEquals("Index greater than list size!", exception.getMessage());

    }

}