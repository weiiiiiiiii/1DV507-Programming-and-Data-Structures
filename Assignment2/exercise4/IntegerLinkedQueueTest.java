package ww222ag_assign2.exercise4;

import static org.junit.jupiter.api.Assertions.*;
import ww222ag_assign1.exercise5.IntQueue;
class IntegerLinkedQueueTest {
    @org.junit.jupiter.api.Test
    void size() {
        IntegerLinkedQueue tester = new IntegerLinkedQueue();
        assertTrue(tester.size()>=0, "Size");
        tester.enqueue(1);
        tester.enqueue(2);
        assertTrue(tester.size()>=0, "Size");
        tester.dequeue();
        tester.dequeue();
        assertTrue(tester.size()>=0, "Size");
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        IntegerLinkedQueue tester = new IntegerLinkedQueue();
        assertTrue(tester.isEmpty(), "isEmpty");
        tester.enqueue(1);
        assertFalse(tester.isEmpty(),"is not empty");
        tester.dequeue();
        assertTrue(tester.isEmpty(), "isEmpty");
    }

    @org.junit.jupiter.api.Test
    void enqueue() {
        int valueToEnqueu = 34;
        IntegerLinkedQueue tester = new IntegerLinkedQueue();
        tester.enqueue(valueToEnqueu);
        assertEquals(tester.dequeue(),valueToEnqueu,"Enqueu / dequeu");

    }

    @org.junit.jupiter.api.Test
    void dequeue() {
        int valueToEnqueu = 34;
        IntegerLinkedQueue tester = new IntegerLinkedQueue();
        tester.enqueue(valueToEnqueu);
        assertEquals(tester.dequeue(),valueToEnqueu,"Enqueu / dequeu");
    }

    @org.junit.jupiter.api.Test
    void first() {
        int valueFirst = 34;
        IntegerLinkedQueue tester = new IntegerLinkedQueue();
        tester.enqueue(valueFirst);
        tester.enqueue(2);
        tester.enqueue(3);
        assertEquals(tester.first(),valueFirst,"First");
    }

    @org.junit.jupiter.api.Test
    void last() {
        int valueLast = 34;
        IntegerLinkedQueue tester = new IntegerLinkedQueue();
        tester.enqueue(1);
        tester.enqueue(valueLast);
        assertEquals(valueLast, tester.last(),"Last");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        IntegerLinkedQueue tester = new IntegerLinkedQueue();
        tester.enqueue(1);
        assertTrue(tester.toString() instanceof String);
    }
}
