package priorityqueue_heap;

@SuppressWarnings("serial")
public class PQUnderFlowException extends RuntimeException {

	public PQUnderFlowException() {
		super();
	}

	public PQUnderFlowException(String message) {
		super(message);
	}
}
