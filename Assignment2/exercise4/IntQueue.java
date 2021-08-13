package ww222ag_assign2.exercise4;

public interface IntQueue extends Iterable<Integer> {
    /**
     * Current queue size
     * @return int
     */
    public int size();                     // current queue size

    /**
     * Check if the queue is empty
     * @return true if the queue is empty
     */
    public boolean isEmpty();              // true if queue is empty

    /**
     * Add int element at the end of the queue
     * @param element int to add to the queue
     */
    public void enqueue(int element);   // add element at end of queue

    /**
     * Return and remove first element
     * @throws IllegalStateException when the queue is empty
     * @return int Return and remove first element
     */
    public int dequeue() throws IllegalStateException;               // return and remove first element.

    /**
     * Return first element of the queue (without removing it)
     * @return int Return first element
     */
    public int first();                 // return (without removing) first element

    /**
     * Return last element of the queue (without removing it)
     * @return int Return last element
     */
    public int last();                  // return (without removing) last element

    /**
     * Return a string representation of the queue content
     * @return String representation of the queue content
     */
    public String toString();              // return a string representation of the queue content
}
