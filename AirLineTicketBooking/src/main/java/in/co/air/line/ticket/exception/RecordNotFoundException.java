package in.co.air.line.ticket.exception;

/**
 * RecordNotFoundException thrown when a record not found occurred
 * 
 *@author kartik
 * 
 */

public class RecordNotFoundException extends Exception
{

	/**
	 * @param msg
	 *            error message
	 */
	public RecordNotFoundException(String msg) {
		super(msg);

	}
}
