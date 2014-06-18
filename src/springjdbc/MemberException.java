package springjdbc;


public class MemberException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MemberException() {
    }

    public MemberException(String message) {
        super(message);
    }

    public MemberException(String message, Throwable cause) {
        super(message, cause);
    }

    public MemberException(Throwable cause) {
        super(cause);
    }
}
