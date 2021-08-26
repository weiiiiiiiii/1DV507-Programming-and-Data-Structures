package ww222ag_assign4.exercise5;

import java.util.Iterator;

public class HashWordSet implements WordSet{
	
	public class Node {
		
		  private Word value;
	      private Node next;
	      
	      public Node(Word value) {
	            
	    	  this.value = value;
	      }
	      
	      public Word getValue() {
	            return value;
	      }
	}
	
	private int size;
	private Node[] buckets;
	
	public HashWordSet(){
		
		buckets=new Node[4];
		size=0;
	}
	
	
	

	@Override
	public Iterator<Word> iterator() {
		
		return new HashSetIterator();
	}

	@Override
	public void add(Word word) {
		
		int h=word.hashCode();
		if(h<0)
			h=-h;
		h=h%buckets.length;
		
		Node current=buckets[h];
		while(current !=null)
		{
			if(current.value.equals(word))
				return;
			current=current.next;
			
			
		}
		Node newNode=new Node(word);
		newNode.next=buckets[h];
		buckets[h]=newNode;
		size++;
		if(size==buckets.length)
			rehash();
		
		
	}
	
	private void rehash() {
		
		Word[] temp=new Word[buckets.length];
		
		int position=0;
		for(int i=0;i<buckets.length;i++)
		{
			if(buckets[i] !=null)
			{
				Node sth=buckets[i];
				temp[position]=sth.value;
				position++;
				while(sth.next !=null)
				{
					temp[position]=sth.next.value;
					position++;
					sth=sth.next;
				}
			}
			
		}
		
		buckets=new Node[buckets.length*2];
		size=0;
		
		for(int i=0;i<temp.length;i++)
		{
			add(temp[i]);
		}

	}

	@Override
	public boolean contains(Word word) {
		
		int h=word.hashCode();
		if(h<0)
			h=-h;
		h=h%buckets.length;
		
		Node current=buckets[h];
		while(current!=null)
		{
			if(current.value.equals(word))
				return true;
			current=current.next;
		}
		return false;
		
		
	}

	@Override
	public int size() {
		
		return size;
	}
	@Override
	
	public String toString(){
		
		String str="";
		for(int i=0;i<buckets.length;i++)
		{
			if(buckets[i] !=null)
			{
				Node sth=buckets[i];
				str=str+sth.value+" ";
				while(sth.next !=null)
				{
					
					str=str+sth.next.value+" ";
					sth=sth.next;
				}
			}
			
		}
		return str;
		
	}
	
	
	
	
	
	
	public class HashSetIterator implements Iterator<Word>{
		
        private Stack stack=new LiFo();
		
		
		
		public HashSetIterator(){
			
			for(int i=0;i<buckets.length;i++)
			{
				if(buckets[i] !=null)
				{
					Node sth=buckets[i];
					stack.push(sth.value);
					while(sth.next !=null)
					{
						stack.push(sth.next.value);
						sth=sth.next;
					}
				}
				
			}
		}
		
		

		@Override
		public boolean hasNext() {
			
			return !stack.isEmpty();
		}

		@Override
		public Word next() {
			
			return (Word)stack.pop();
		}
		
		
	}
	
	

}
