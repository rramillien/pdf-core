package com.web4enterprise.pdf.core.exceptions;

/**
 * Exception thrown when PDF cannot be generated correctly.
 * 
 * @author Régis Ramillien
 */
public class PdfGenerationException extends Exception {
	/**
	 * The default serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

    /**
     * Constructs a new exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this exception's detail message.
     *
     * @param  message the detail message (which is saved for later retrieval
     *         by the {@link #getMessage()} method).
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method).  (A <tt>null</tt> value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
     */
	public PdfGenerationException(String message, Throwable cause) {
		super(message, cause);
	}
}
