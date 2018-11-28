package priorityqueue_heap;

@SuppressWarnings("serial")
public class PQOverFlowException extends RuntimeException{

	//private static final long serialVersionUID = 1L;

	public PQOverFlowException() {
		super();
	}

	public PQOverFlowException(String message) {
		super(message);
	}
}
