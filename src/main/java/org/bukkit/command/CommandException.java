package org.bukkit.command;

/**
 * Thrown when an unhandled exception occurs during the execution of a Command
 */
public class CommandException extends RuntimeException {
    private static final long serialVersionUID = -380691656197884344L;

    /**
     * Creates a new instance of <code>CommandException</code> without detail message.
     */
    public CommandException() {}

    /**
     * Constructs an instance of <code>CommandException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public CommandException(String msg) {
        super(msg);
    }

    public CommandException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
