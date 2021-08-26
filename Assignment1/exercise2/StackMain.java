package ww222ag_assign1.exercise2;

public class StackMain {
	// Note that pop and peek can raise Exception so its code is
	// surrounded by try catch block
    public static void main(String[] args) {
	       // creating a new stack
	        Stack stack = new Stack();
	        // popping an element from empty stack, will raise an exception
	   
	        try{
	              System.out.println("stack element removed "+stack.pop());
	        }
	    catch(IllegalStateException e){
	              System.out.println("Stack is empty so cannot pop");
	         }
	    
	        
     // test: creating a new string and then pushing it into stack
	        String s= "newstring";
	        stack.push(s);
	       System.out.println(s+" pushed");
	       
	 // pushing another new string into stack"
	        s = "anothernewstring";
	       stack.push(s);
	        System.out.println(s+" pushed");
	        
	    // peeking top element of stack
	         try{
	             System.out.println("stack top element :: "+stack.peek());
	             }
	          catch(IllegalStateException e){
	                        System.out.println("Stack is empty so can not peek");
	          }
	              
	         
	     // popping element from stack
	                try{
	                        System.out.println("stack element removed "+stack.pop());
	                }
	                catch(IllegalStateException e){
	                        System.out.println("Stack is empty so can not pop");
	                }
	                
	                
	       // peeking top element
	                try{
	                        System.out.println("stack top element : "+stack.peek());
	                }
	                catch(IllegalStateException e){
	                        System.out.println("Stack is empty so can not peek");
	                }
	                
	                
	                // popping top element
	                try{
	                        System.out.println("stack element removed "+stack.pop());
	                }
	                catch(IllegalStateException e){
	                        System.out.println("Stack is empty so can not pop");
	                }
	                
	                // at this point stack will be empty so exception will be raised 
	                try{
	                        System.out.println("stack top element : "+stack.peek());
	                }
	                catch(IllegalStateException e){
	                        System.out.println("Stack is empty so can not peek");
	                }
	                
	                // stack is empty, so popping will raise an exception
	                try{
	                        System.out.println("stack element removed "+stack.pop());
	                }
	                catch(IllegalStateException e){
	                        System.out.println("Stack is empty so can not pop");
	                }
	                
	        }
	}