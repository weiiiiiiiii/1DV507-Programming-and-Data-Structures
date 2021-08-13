package ww222ag_assign2.exercise5;


import org.junit.jupiter.api.Test;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void size() {
        LinkedQueue<String> stringTester = new LinkedQueue();
        LinkedQueue<Integer> intTester = new LinkedQueue();
        assertTrue(stringTester.size()>=0);
        assertTrue(intTester.size()>=0);
        intTester.enqueue(1);
        intTester.enqueue(2);
        stringTester.enqueue("hello");
        stringTester.enqueue("world");
        assertTrue(stringTester.size()>=0);
        assertTrue(intTester.size()>=0);
    }

    @Test
    void isEmpty() {
        LinkedQueue<String> stringTester = new LinkedQueue();
        LinkedQueue<Integer> intTester = new LinkedQueue();
        assertTrue(stringTester.isEmpty());
        assertTrue(intTester.isEmpty());
        intTester.enqueue(1);
        stringTester.enqueue("hello");
        assertFalse(stringTester.isEmpty());
        assertFalse(intTester.isEmpty());
    }

    @Test
    void enqueue() {
        LinkedQueue<String> stringTester = new LinkedQueue();
        LinkedQueue<Integer> intTester = new LinkedQueue();
        intTester.enqueue(1);
        intTester.enqueue(2);
        stringTester.enqueue("hello");
        stringTester.enqueue("world");
        assertEquals(stringTester.last(),"world");
        assertEquals(intTester.last(),2);
    }

    @Test
    void dequeue() {
        LinkedQueue<String> stringTester = new LinkedQueue();
        LinkedQueue<Integer> intTester = new LinkedQueue();
        intTester.enqueue(1);
        intTester.enqueue(2);
        stringTester.enqueue("hello");
        stringTester.enqueue("world");
    }

    @Test
    void first() {
        int firstInt = 10;
        String firstString = "universe";
        LinkedQueue<String> stringTester = new LinkedQueue();
        LinkedQueue<Integer> intTester = new LinkedQueue();
        intTester.enqueue(firstInt);
        intTester.enqueue(10);
        stringTester.enqueue(firstString);
        stringTester.enqueue("hello");
        assertEquals(stringTester.first(),firstString);
        assertEquals(intTester.first(),firstInt);
    }

    @Test
    void last() {
        int lastInt = 10;
        String lastString = "universe";
        LinkedQueue<String> stringTester = new LinkedQueue();
        LinkedQueue<Integer> intTester = new LinkedQueue();
        intTester.enqueue(1);
        intTester.enqueue(lastInt);
        stringTester.enqueue("hello");
        stringTester.enqueue(lastString);
        assertEquals(stringTester.last(),lastString);
        assertEquals(intTester.last(),lastInt);
    }

    @Test
    void testToString() {
        LinkedQueue<String> stringTester = new LinkedQueue();
        LinkedQueue<Integer> intTester = new LinkedQueue();
        intTester.enqueue(1);
        stringTester.enqueue("hello");
        assertTrue(stringTester.toString() instanceof String);
        assertTrue(intTester.toString() instanceof String);
    }
}
    /*    /\   /\
         /  \ /  \
        |  O   O  |
        |    *    |
         \  ---  /    /
          |      |    \
         /        \___/
         | |   | | /  \
         | |\  | | \  /
         |_|  \| | /_/
     */
