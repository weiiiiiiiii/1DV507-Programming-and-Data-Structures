package ww222ag_assign3.exercise6;

import static org.junit.Assert.*;
import org.junit.*;


public class SortTest{	
    private static int test_count = 0;

	//Is executed before every test method (not test case).
	@Before
	public void setUp() {
		test_count++;
		System.out.println("Test "+ test_count);
	}
	
	/* Is executed after every test method (not test case).*/
	@After
	public void tearDown() {}
	
	
	//  My list tests
	          
	 
	
	
	@Test
	public void testIntInsertionSort() {
		
		SortingAlgorithms test= new SortingAlgorithms();
		
		int[] test2={3,4,2,1};
		int[] result2={1,2,3,4};
		assertArrayEquals(result2,test.insertionSort(test2));
		
		int[] test3={1,2,3,4};
		assertArrayEquals(test3,test.insertionSort(test3));
		
		
	}
	
	@Test
	public void testIntMergeSort() {
		
		SortingAlgorithms test= new SortingAlgorithms();
		
		int[] test2={3,4,2,1};
		int[] result2={1,2,3,4};
		assertArrayEquals(result2,test.mergeSort(test2));
		
		int[] test3={1,2,3,4};
		assertArrayEquals(test3,test.mergeSort(test3));
		
		
		
	}
	
	@Test
	public void testStringInsertionSort() {
		
		SortingAlgorithms test= new SortingAlgorithms();
		
		String[] test2={"abc","mis","aa","tv","cba","aaa","bac"};
		String[] result2={"aa","aaa","abc","bac","cba","mis","tv"};
		assertArrayEquals(result2,test.insertionSort(test2));
		
		String[] test3={"aa","aaa","abc","bac","cba","mis","tv"};
		assertArrayEquals(test3,test.insertionSort(test3));
		
		
		
	}
	
	@Test
	public void testStringMergeSort() {
		
		SortingAlgorithms test= new SortingAlgorithms();
		
		String[] test2={"abc","mis","aa","tv","cba","aaa","bac"};
		String[] result2={"aa","aaa","abc","bac","cba","mis","tv"};
		assertArrayEquals(result2,test.mergeSort(test2));
		
		String[] test3={"aa","aaa","abc","bac","cba","mis","tv"};
		assertArrayEquals(test3,test.mergeSort(test3));
		
		
		
	}
	
	
}
