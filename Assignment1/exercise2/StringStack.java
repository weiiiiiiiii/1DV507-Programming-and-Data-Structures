package ww222ag_assign1.exercise2;

//can not be changed

public interface StringStack {
	   int size(); 			// Current stack size
	   boolean isEmpty(); 		// true if stack is empty
	   void push(String element); 	// Add element at top of stack
	   String pop() throws Exception; 		// Return and remove top element,
					// exception if stack is empty
	   String peek() throws Exception; 		// Return (without removing) top element,
					// exception if stack is empty.
	}