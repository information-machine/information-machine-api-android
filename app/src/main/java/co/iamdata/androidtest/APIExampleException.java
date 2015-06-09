package co.iamdata.androidtest;

/**
 * Created by Dejan on June/8/2015.
 */
public class APIExampleException extends Exception {
    /**
     * Initialization constructor
     * @param	reason	The reason for throwing exception
     */
    public APIExampleException(String reason) {
        super(reason);
    }

    /**
     * Constructs a new {@code Exception} with the current stack trace, the
     * specified detail message and the specified cause.
     *
     * @param detailMessage
     *            the detail message for this exception.
     * @param throwable
     *            the cause of this exception.
     */
    public APIExampleException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }
}
