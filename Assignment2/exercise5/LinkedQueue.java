package ww222ag_assign2.exercise5;

import java.util.Iterator;

public class LinkedQueue<T> implements Queue<T> {
    private int size = 0;
    private Node<T> head, tail;
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
    public void enqueue(T element) {
        Node tmp = new Node(element);
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
    public T dequeue() throws IllegalStateException {
        if(size==0)
            throw new IllegalStateException("Empty Queue");
        T tmp = head.getValue();
        head = head.getNext();
        size--;
        return tmp;
    }

    /**
     * Return the first element of the queue
     * @return int
     */
    @Override
    public T first() {
        return head.getValue();
    }

    /**
     * Return the last element of the queue
     * @return int
     */
    @Override
    public T last() {
        return tail.getValue();
    }


    @Override
    public Iterator <T> iterator () { return new LinkedQueue.QueueIterator(); }

    class QueueIterator implements Iterator<T> { // Inner iterator class
        private Node<T> node = head; // First node is head
        /**
         * Next element in the iteration
         * @return Integer
         */
        public T next() {
            T val = node.getValue(); // Read current value
            node = node.getNext(); // Move one step ahead
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
        Node node = head;
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
