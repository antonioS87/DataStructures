package maps.hashmap;

import org.junit.jupiter.api.Test;

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
}