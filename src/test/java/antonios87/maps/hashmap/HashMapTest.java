package antonios87.maps.hashmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class HashMapTest {

    @Test
    void testPutRemoveSize() {
        HashMap<Integer, String> map = new HashMap<>(5);
        map.put(2, "a");
        assertEquals(1, map.size());
        map.put(7, "b");
        assertEquals(2, map.size());
        map.put(12, "c");
        assertEquals(3, map.size());
        map.put(17, "d");
        assertEquals(4, map.size());
        System.out.println(map.toString());
        map.put(2, "e");
        assertEquals(4, map.size());
        map.put(7, "f");
        assertEquals(4, map.size());
        map.put(12, "g");
        assertEquals(4, map.size());
        map.put(17, "h");
        assertEquals(4, map.size());
        System.out.println(map.toString());

        map.put(0, "1");
        assertEquals(5, map.size());
        map.put(5, "2");
        assertEquals(6, map.size());
        map.put(10, "3");
        assertEquals(7, map.size());
        map.put(15, "4");
        assertEquals(8, map.size());
        System.out.println(map.toString());
        map.put(0, "5");
        assertEquals(8, map.size());
        map.put(5, "6");
        assertEquals(8, map.size());
        map.put(10, "7");
        assertEquals(8, map.size());
        map.put(15, "8");
        assertEquals(8, map.size());
        System.out.println(map.toString());

        map.remove(0);
        assertEquals(7, map.size());
        System.out.println(map.toString());
        map.remove(10);
        assertEquals(6, map.size());
        System.out.println(map.toString());
        map.remove(15);
        assertEquals(5, map.size());
        System.out.println(map.toString());
        map.remove(5);
        assertEquals(4, map.size());
        System.out.println(map.toString());
        map.remove(5);
        assertEquals(4, map.size());
        System.out.println(map.toString());

        map.remove(17);
        assertEquals(3, map.size());
        System.out.println(map.toString());
        map.remove(7);
        assertEquals(2, map.size());
        System.out.println(map.toString());
        map.remove(2);
        assertEquals(1, map.size());
        System.out.println(map.toString());
        map.remove(12);
        assertEquals(0, map.size());
        System.out.println(map.toString());

        map.put(2, "a");
        assertEquals(1, map.size());
        map.put(7, "b");
        assertEquals(2, map.size());
        map.put(12, "c");
        assertEquals(3, map.size());
        map.put(17, "d");
        assertEquals(4, map.size());
        System.out.println(map.toString());
    }

    @Test
    public void testPutGet(){
        HashMap<Integer, String> map = new HashMap<>(5);
        map.put(2, "a");
        assertEquals(map.get(2), "a");
        map.put(7, "b");
        assertEquals(map.get(7), "b");
        map.put(123, "c");
        assertEquals(map.get(123), "c");
    }

    @Test
    public void testContainsKey(){
        HashMap<Integer, String> map = new HashMap<>(5);
        map.put(2, "a");
        assertTrue(map.containsKey(2));
        assertFalse(map.containsKey(3));
        map.put(3, "a");
        assertTrue(map.containsKey(3));
        map.remove(2);
        assertFalse(map.containsKey(2));
        assertTrue(map.containsKey(3));
        map.remove(3);
        assertFalse(map.containsKey(3));
    }

    @Test
    public void testContainsValue(){
        HashMap<Integer, String> map = new HashMap<>(5);
        map.put(2, "a");
        assertTrue(map.containsValue("a"));
        assertFalse(map.containsValue("b"));
        map.put(3, "b");
        assertTrue(map.containsValue("b"));
        map.remove(2);
        assertFalse(map.containsValue("a"));
        assertTrue(map.containsValue("b"));
        map.remove(3);
        assertFalse(map.containsValue("b"));
    }
}