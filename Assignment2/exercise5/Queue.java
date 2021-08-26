package ww222ag_assign2.exercise5;

public interface Queue<T> extends Iterable<T> {
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
     * Add element at the end of the queue
     * @param element to add to the queue
     */
    public void enqueue(T element);   // add element at end of queue

    /**
     * Return and remove first element
     * @throws IllegalStateException when the queue is empty
     * @return Return and remove first element
     */
    public T dequeue() throws IllegalStateException;               // return and remove first element.

    /**
     * Return first element of the queue (without removing it)
     * @return Return first element
     */
    public T first();                 // return (without removing) first element

    /**
     * Return last element of the queue (without removing it)
     * @return Return last element
     */
    public T last();                  // return (without removing) last element

    /**
     * Return a string representation of the queue content
     * @return String representation of the queue content
     */
    public String toString();              // return a string representation of the queue content
}
