package ww222ag_assign3.exercise6;

public class Main {
//
	public static void main(String[] args) {
		int[] test1={3,1,2,4};
		String[] test2={"abc","mis","aa","tv","cba","aaa","bac"};
		SortingAlgorithms test= new SortingAlgorithms();
		
		for(int i=0;i<test1.length;i++)
		{
			System.out.println(test.insertionSort(test1)[i]);
		}
		System.out.println("");
		
		for(int i=0;i<test1.length;i++)
		{
			System.out.println(test.mergeSort(test1)[i]);
		}
		System.out.println("");
		
		for(int i=0;i<test2.length;i++)
		{
			System.out.println(test.insertionSort(test2)[i]);
		}
		System.out.println("");
		
		for(int i=0;i<test2.length;i++)
		{
			System.out.println(test.mergeSort(test2)[i]);
		}
		System.out.println("");
		
		for(int i=0;i<test1.length;i++)
		{
			System.out.println(test1[i]);
		}
		
		for(int i=0;i<test2.length;i++)
		{
			System.out.println(test2[i]);
		}

	}

}
