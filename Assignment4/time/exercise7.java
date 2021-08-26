package ww222ag_assign4.time;

import java.util.Random;

public class exercise7 {

	public static void main(String[] args) {
		
		int[] integerArray=new int[80];
		Random r=new Random();
		
		for(int i=0;i<integerArray.length;i++)
		{
			integerArray[i]=r.nextInt(integerArray.length*2);
		}
		
		String[] StringArray=new String[80];
		
		for(int i=0;i<StringArray.length;i++)
		{
			StringArray[i]=getRandomString(10);
		}
		
		
		int result1=0;
		for(int i=0;i<5;i++)
		{
			int count=0;
			long before = System.nanoTime();
			while(true){
				
				ex7SortingAlgorithms.insertionSort(integerArray);
				count++;
				long after = System.nanoTime();
				long estimatedTime = after-before;
				if(estimatedTime>=10E9)
				{
					break;
				}
			}
			result1=result1+count;
			
		}
		
		System.out.println("Insertion Sort for Integers: "+result1/5);
		
		int result2=0;
		for(int i=0;i<5;i++)
		{
			int count=0;
			long before = System.nanoTime();
			while(true){
				
				ex7SortingAlgorithms.insertionSort(StringArray);
				count++;
				long after = System.nanoTime();
				long estimatedTime = after-before;
				if(estimatedTime>=10E9)
				{
					break;
				}
			}
			result2=result2+count;
			
		}
		
		System.out.println("Insertion Sort for Strings: "+result2/5);
		
		
		int result3=0;
		for(int i=0;i<5;i++)
		{
			int count=0;
			long before = System.nanoTime();
			while(true){
				
				ex7SortingAlgorithms.mergeSort(integerArray);
				count++;
				long after = System.nanoTime();
				long estimatedTime = after-before;
				if(estimatedTime>=10E9)
				{
					break;
				}
			}
			result3=result3+count;
			
		}
		
		System.out.println("Merge Sort for Integers: "+result3/5);
		
		
		int result4=0;
		for(int i=0;i<5;i++)
		{
			int count=0;
			long before = System.nanoTime();
			while(true){
				
				ex7SortingAlgorithms.mergeSort(StringArray);
				count++;
				long after = System.nanoTime();
				long estimatedTime = after-before;
				if(estimatedTime>=10E9)
				{
					break;
				}
			}
			result4=result4+count;
			
		}
		
		System.out.println("Merge Sort for Strings: "+result4/5);
		
		

	}
	
	public static String getRandomString(int length) {    
	    StringBuffer buffer = new StringBuffer("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");    
	    StringBuffer sb = new StringBuffer();    
	    Random r = new Random();    
	    int range = buffer.length();    
	    for (int i = 0; i < length; i ++) {    
	        sb.append(buffer.charAt(r.nextInt(range)));    
	    }    
	    return sb.toString();    
	} 

}
