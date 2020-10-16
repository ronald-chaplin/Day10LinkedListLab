

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RonsLinkedLIstTest {

    RonsLinkedList list;

    @BeforeEach
    void init(){
        list = new RonsLinkedList();
    }

    @Test
    void addTest(){
        Integer expected = 1;
        list.add(expected);
        assertEquals(expected, list.get(0), "Should be 1");
    }

    @Test
    void addTest2(){
        Integer expected = 3;
        list.add(0);
        list.add(expected, 1);
        assertEquals(expected, list.get(1), "Should be 3");
    }

    @Test
    void getTest(){
        Integer expected = 0;
        list.add(0);
        list.add(3, 1);
        assertEquals(expected, list.get(0), "Should be 0");
    }

    @Test
    void removeTest(){
        list.add(0);
        list.add(3, 1);
        list.remove(1);
        assertNull(list.get(1), "Should be null");
    }

    @Test
    void sizeTest(){
        int expected = 2;
        list.add(0);
        list.add(3, 1);
        assertEquals(expected, list.size(), "Should be 2");
    }

    @Test
    void toStringTest(){
        list.add(0);
        list.add(3, 1);
        assertEquals("[0][3]", list.toString(), "Should be [0][3]" );
    }
}
