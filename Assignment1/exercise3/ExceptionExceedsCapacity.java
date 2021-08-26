package ww222ag_assign1.exercise3;

public class ExceptionExceedsCapacity extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ExceptionExceedsCapacity(int maxCapacity) {
        super("No space in vehicle. Max capacity: "+maxCapacity);
    }
	
    ExceptionExceedsCapacity(String errorMsg) {
        super(errorMsg);
    }
}
