package ww222ag_assign1.exercise2;

public class Stack implements StringStack{

	private Node head;      // head node
    private int numElements; // number of elements in stack
    
    // constructor, initiates head as null and number of elements as 0
    public Stack(){
            Node head= null;
            numElements = 0;
    }
    
    // size is number of elements in stack
    public int size(){
            return numElements;      
    }
    
    
    // if size is 0 then stack is empty so true will be returned
    // otherwise we return false
    public boolean isEmpty(){
            return (numElements==0);
    }
    
    // pushing a new element into stack, i.e. create a new node   
    // and point its next to head, and then this node will become the new head
    public void push(String element){
            Node n = new Node(element);
            n.next = head;
            head = n;
            numElements ++; // size of stack is increased by one            
    }
    
    
    // pop element returns the top element but also removes it from
    // stack, in case of empty stack exception will be raised
    public String pop(){
            if(numElements == 0){
                    throw new IllegalStateException("Stack is Empty");
            }
            String s = head.data;
            head = head.next;
            numElements --; // size of stack is decreased by one
            return s;
    }
    
    // peek method returns the top element if stack is not empty
    // otherwise raise an exception  
    public String peek(){
            if(numElements == 0){
                    throw new IllegalStateException("Stack is Empty");
            }
            return head.data;
    }
    
    // inner class Node to store a string and refer to next element     
    class Node{
            public String data;
            public Node next ;
            public Node(String data){
                    this.data = data;
                    this.next = null;
            }
    }
}