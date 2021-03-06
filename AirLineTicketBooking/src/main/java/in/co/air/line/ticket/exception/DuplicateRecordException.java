package in.co.air.line.ticket.exception;

/**
 * DuplicateRecordException thrown when a duplicate record occurred
 * 
 * @author kartik
 * 
 */
public class DuplicateRecordException  extends Exception
{
	/**
	 * @param msg
	 *            error message
	 */
	public DuplicateRecordException(String msg) {
		super(msg);
	}
}
