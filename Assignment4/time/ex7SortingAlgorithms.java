package ww222ag_assign4.time;

public class ex7SortingAlgorithms{
	
	private static int[] arr;
	private static String[] str;
	
	public static int[] insertionSort(int[] in){
		
		int temp;
		int j=0;
		int[] values=new int[in.length];
		System.arraycopy(in,0,values,0,in.length); 
		
		for(int i=1;i<values.length;i++)
		{
			if(values[i]<values[i-1])
			{
				temp=values[i];
				
				for(j=i-1;j>=0&&temp<values[j];j--)
				{
					
					values[j+1]=values[j];
					
				}
				
				values[j+1]=temp;
				
				
			}
			
			
		}
		
		return values;
		
		
	}
	
	public static int[] mergeSort(int[] in){
		
		int[] values=new int[in.length];
		System.arraycopy(in,0,values,0,in.length); 
		
		sort(values,0,values.length-1);
		
		return arr;
		
	}
	
	private static void sort(int[] data,int left,int right){
		
		if(left>=right)
			return;
		
		int center=(left+right)/2;
		
		sort(data,left,center);
		sort(data,center+1,right);
		
		merge(data,left,center,right);
		
	}
	
	private static void merge(int[] data,int left,int center,int right){
		
		int[] tmpArr=new int[data.length];
		int mid=center+1;
		int third=left;
		int tmp=left;
		
		while(left<=center&&mid<=right){
			
			if(data[left]<=data[mid])
			{
				
				tmpArr[third++]=data[left++];
				
			}
			else
			{
				tmpArr[third++]=data[mid++];
				
			}
		}
		while(mid<=right)
		{
			tmpArr[third++]=data[mid++];
		}
		while(left<=center)
		{
			tmpArr[third++]=data[left++];
		}
		
		while(tmp<=right)
		{
			data[tmp]=tmpArr[tmp++];
		}
		
		arr=data;
		
	}
	
	
	
	
	
	
	
	public static String[] insertionSort(String[] in){
		
		String temp;
		int j=0;
		String[] values=new String[in.length];
		System.arraycopy(in,0,values,0,in.length); 
		
		for(int i=1;i<values.length;i++)
		{
			if(values[i].compareToIgnoreCase(values[i-1])<0)
			{
				temp=values[i];
				
				for(j=i-1;j>=0&&temp.compareToIgnoreCase(values[j])<0;j--)
				{
					
					values[j+1]=values[j];
					
				}
				
				values[j+1]=temp;
				
				
			}
			
			
		}
		
		return values;
		
		
	}
	
		
		
		
	
	
    public static String[] mergeSort(String[] in){
		
    	String[] values=new String[in.length];
		System.arraycopy(in,0,values,0,in.length); 
		sort(values,0,values.length-1);
		
		return str;
		
	}
	
	private static void sort(String[] data,int left,int right){
		
		if(left>=right)
			return;
		
		int center=(left+right)/2;
		
		sort(data,left,center);
		sort(data,center+1,right);
		
		merge(data,left,center,right);
		
	}
	
	private static void merge(String[] data,int left,int center,int right){
		
		String[] tmpArr=new String[data.length];
		int mid=center+1;
		int third=left;
		int tmp=left;
		
		while(left<=center&&mid<=right){
			
			if(data[left].compareToIgnoreCase(data[mid])<=0)
			{
				
				tmpArr[third++]=data[left++];
				
			}
			else
			{
				tmpArr[third++]=data[mid++];
				
			}
		}
		while(mid<=right)
		{
			tmpArr[third++]=data[mid++];
		}
		while(left<=center)
		{
			tmpArr[third++]=data[left++];
		}
		
		while(tmp<=right)
		{
			data[tmp]=tmpArr[tmp++];
		}
		
		str=data;
		
	}
	
	

}
