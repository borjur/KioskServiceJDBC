package springjdbc;

public class UnknownMemberException extends MemberException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnknownMemberException() {
    }

    public UnknownMemberException(String message) {
        super(message);
    }

    public UnknownMemberException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownMemberException(Throwable cause) {
        super(cause);
    }

}
