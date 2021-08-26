package ww222ag_assign4.exercise4;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class LiFo implements Stack {
	
	private Object[] list=new Object[0];

	public LiFo(){
		
	}
	
	public int size() {
		
		int size=list.length;
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return(list.length==0);
	}

	public void push(Object element) {
		
		Object[] temp=new Object[list.length+1];
		
		for(int i=0;i<list.length;i++)
		{
			
			temp[i]=list[i];
			
		}
		
		temp[temp.length-1]=element;
		
		list=temp;
		
		
	}

	public Object pop() {
		
		Object top;
		try
		{
			top=list[list.length-1];
			Object[] temp2=new Object[list.length-1];
			
			for(int i=0;i<temp2.length;i++)
			{
				
				temp2[i]=list[i];
				
			}
			list=temp2;
		    return top;
		}catch(Exception e)
		{
			System.err.println("Stack is empty");
			return 0;
		}
		
		
	}

	public Object peek(){
		Object top;
		
		try
		{
			top=list[list.length-1];
			return top;
		
		}catch(Exception e)
		{
			System.err.println("Stack is empty");
			return 0;
		}
		
		
		
	}

	
    public Iterator<Object> iterator() {
		
		return new ArrayIterator();
	}
	
    
    
    
	
	public class ArrayIterator implements Iterator<Object> {
		
		private int index = 0;
		private boolean lastRemoved = false;
		
		public boolean hasNext(){
	        return (index < list.length);
	    }

		@Override
		public Object next() throws NoSuchElementException {
	        if (index >= list.length) throw new NoSuchElementException("Array index: " + index);
	        Object object = list[index];
	        index++;
	        lastRemoved = false;
	        return object;
	    }
		
		public void remove(){
	        if (index == 0) throw new IllegalStateException();
	        if (lastRemoved) throw new IllegalStateException();
	        list[index-1] = null;
	        lastRemoved = true;
	    }
		
	}
	

}
