package ww222ag_assign2.exercise5;

public class Node<T> {
	 private Node next;
	    private T value;

	    /**
	     * Constructor to create an Node
	     * @param n value to be stored in this node
	     */
	    Node(T n) {
	        this.value = n;
	    }

	    /**
	     * Change next node in the Linked List
	     * @param node Node to be attached as next node
	     */
	    void changeNext(Node node) {
	        this.next = node;
	    }

	    /**
	     * Return the next Node
	     * @return Node
	     */
	    public Node getNext() {
	        return next;
	    }

	    /**
	     * Get the value of this Node
	     * @return T
	     */
	    public T getValue() {
	        return value;
	    }
	}
