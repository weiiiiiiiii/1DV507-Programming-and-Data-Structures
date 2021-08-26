package ww222ag_assign4.exercise9;

public class BinaryIntHeapMain {

	public static void main(String[] args) {
		
		BinaryIntHeap test=new BinaryIntHeap();
		
		test.insert(37);
		test.insert(19);
		test.insert(15);
		test.insert(24);
		test.insert(12);
		test.insert(41);

		
		System.out.println(test.toString());
		
		System.out.println(test.pullHighest());
		System.out.println(test.toString());
		
		System.out.println(test.pullHighest());
		System.out.println(test.toString());

	}

}
