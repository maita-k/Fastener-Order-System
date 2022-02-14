public class IllegalFastener  extends Exception {

	private static final long serialVersionUID = 143563565455L;

	public IllegalFastener() {
		super("Illegal parameter value supplied to Fastenter object.");
	}

	/**
	 * Passes along the message supplied to the exception.
	 * @param message A more specific message.
	 */
	public IllegalFastener(String message) {
		super(message);
	}



}
