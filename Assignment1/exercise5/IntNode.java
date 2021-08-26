package ww222ag_assign1.exercise5;

public class IntNode {
	   private IntNode next;
	    private int value;

	    //Constructor to create an IntNode
	     // int value to be stored in this node
	  
	    IntNode(int n) {
	        this.value = n;
	    }

	    // Change next node in the Linked List
	    // node IntNode to be attached as next node
	     
	    void changeNext(IntNode node) {
	        this.next = node;
	    }

	    //Return the next IntNode
	
	    public IntNode getNext() {
	        return next;
	    }

	    //Get the int value of this IntNode

	    public int getValue() {
	        return value;
	    }
	}
