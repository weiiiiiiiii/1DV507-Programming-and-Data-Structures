package ww222ag_assign4.exercise4;

import java.util.Iterator;

public class TreeWordSet implements WordSet{
	
	private Node root;
	private int size=0;
	private static String print="";
	
	public TreeWordSet(){
		
		root=null;
		
	}
	
	class Node
	{
		public Word value;
		public Node left;
		public Node right;
		public void addNode(Node newNode) {
			
			if(newNode.value.compareTo(value)<0)
			{
				if(left==null)
				{
					left=newNode;
					size++;
				}
				else
				{
					left.addNode(newNode);
					
				}
					
				
			}
			else if(newNode.value.compareTo(value)>0)
			{
				if(right==null)
				{
					right=newNode;
					size++;
					
				}
				else
				{
					
					right.addNode(newNode);
					
				}

		    }
			
		}
		
	}
	
	
	
	

	@Override
	public Iterator<Word> iterator() {
		
		return new WordIterator();
	}

	@Override
	public void add(Word word) {
		
		Node newNode=new Node();
		newNode.value=word;
		newNode.left=null;
		newNode.right=null;
		if(root==null)
		{
			root=newNode;
			size++;
		}
		else
		{
			root.addNode(newNode);
			
		}
			
		
		
		
	}
	
	@Override
	public boolean contains(Word word) {
		
		Node current = root; 
		while (current != null)
		{
		int d = current.value.compareTo(word);
		if (d == 0) 
		{ return true; }
		else if (d > 0)
		{ current = current.left; }
		else { current = current.right; }
		}
		return false;
		
		
	}

	@Override
	public int size() {
		
		return size;
	}
	
	@Override
	public String toString(){
		
		inorder(root);
		return print;
		
		
	}
	
	
	
	private static void inorder(Node p){
		
		
		if(p !=null)
		{
			
			inorder(p.left);
			print=print+p.value+" ";
			inorder(p.right);
			
		}
	}
	
	
	
	
	public class WordIterator implements Iterator<Word> {
		
		
		private Stack stack=new LiFo();
		
		private void pushLeft(Node x){
			
			while(x!=null)
			{
				stack.push(x);
				x=x.left;
			}
			
			
		}
		
		public WordIterator(){
			
			pushLeft(root);
		}
		
		

		@Override
		public boolean hasNext() {
			
			return !stack.isEmpty();
		}

		@Override
		public Word next() {
			Node x=(Node) stack.pop();
			pushLeft(x.right);
			return x.value;
		}
		
		
	}
}

