package ww222ag_assign2.exercise4;

import java.util.Iterator;

import ww222ag_assign1.exercise5.IntQueue;

public class IntegerLinkedQueue implements IntQueue {
    private int size = 0;
    private IntNode head, tail;

    /**
     * Returns the size of the queue
     * @return int
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Check if the queue is empty or not
     * @return true if the queue is empty
     */
    @Override
    public boolean isEmpty() {
        return size==0;
    }

    /**
     * Adds int to the queue
     * @param element int element to add to the queue
     */
    @Override
    public void enqueue(int element) {
        IntNode tmp = new IntNode(element);
        if(size==0) {
            head = tmp;
        } else {
            tail.changeNext(tmp);
        }
        size++;
        tail = tmp;
    }

    /**
     * Returns the first element of the queue and remove it from the queue
     * @throws IllegalStateException when the queue is empty
     * @return int
     */
    @Override
    public int dequeue() throws IllegalStateException {
        if(size==0)
            throw new IllegalStateException("Empty Queue");
        int tmp = head.getValue();
        head = head.getNext();
        size--;
        return tmp;
    }

    /**
     * Return the first element of the queue
     * @return int
     */
    @Override
    public int first() {
        return head.getValue();
    }

    /**
     * Return the last element of the queue
     * @return int
     */
    @Override
    public int last() {
        return tail.getValue();
    }


    @Override
    public Iterator <Integer> iterator () { return new QueueIterator (); }

    class QueueIterator implements Iterator<Integer> { // Inner iterator class
        private IntNode node = head; // First node is head
        /**
         * Next element in the iteration
         * @return Integer
         */
        public Integer next() {
            int val = node.getValue(); // Read current value
            node =node.getNext(); // Move one step ahead
            return val;
        }

        /**
         * Returns true if there is a next element in the iteration
         * @return boolean
         */
        public boolean hasNext() { return node !=null; }
        public void remove() { throw new RuntimeException("remove() is not implemented"); }
    }

    /**
     * Converts queue into a String
     * @return String that represents all the elements in the queue
     */
    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("[");
        IntNode node = head;
        if (node!=null) {
            while (node.getNext() != null) { // Find last node
                buf.append(" " + node.getValue());
                node = node.getNext();
            }
            //last node print
            buf.append(" " + node.getValue());
        }
        buf.append(" ]");
        return buf.toString();
    }
}
