package ww222ag_assign3.exercise1;

public class PrintRecursive {

	public static void main(String[] args) {
		   String str = "Hello Everyone!";
			//	
		   print(str, 0);
		   System.out.println(); // Line break
		   printReverse(str, 0);
		}

	private static void print(String str, int i) {
		// TODO Auto-generated method stub
		if (i>=str.length()) {
			return;
		}
		System.out.print(str.charAt(i++));
		print(str,i);
		
	}

	private static void printReverse(String str, int i) {
		// TODO Auto-generated method stub
	    if (i >= str.length()) {
	        return;
	    }
	    System.out.print(str.charAt(str.length() - i++ - 1));
	    printReverse(str, i);
	}
}
