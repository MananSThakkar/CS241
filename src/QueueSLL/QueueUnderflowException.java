package QueueSLL;

@SuppressWarnings("serial")
public class QueueUnderflowException extends RuntimeException {
	  public QueueUnderflowException()  {
		    super(); //calling parent's default constructor.
		  }
		  public QueueUnderflowException(String errorMessage)  {
		    super(errorMessage); //calling parent's constructor with parameter.
		  }
}
