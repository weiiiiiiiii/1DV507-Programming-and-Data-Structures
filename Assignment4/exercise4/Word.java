package ww222ag_assign4.exercise4;

public class Word implements Comparable<Word> {

	private String word;
	
	public Word(String str){
		
		
		this.word=str;
		
	}
	
	public String toString(){
		return word; 
	}
	@Override
	public int hashCode(){
		
		return word.toLowerCase().hashCode();
		
	}
	
	@Override
	public boolean equals(Object other){
		
		String str=other.toString();
		
		if(word.toLowerCase().equals(str.toLowerCase()))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	
	@Override
	public int compareTo(Word o) {
		
		String str1=word.toLowerCase();
		String str2=o.toString().toLowerCase();
		
		return str1.compareTo(str2);
		
		
	}
	
	

}
