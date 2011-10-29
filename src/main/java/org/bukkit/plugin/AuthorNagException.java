package org.bukkit.plugin;

public class AuthorNagException extends RuntimeException {
    private static final long serialVersionUID = -4258205358958586496L;
    private final String message;

    /**
     * Constructs a new AuthorNagException based on the given Exception
     *
     * @param message Brief message explaining the cause of the exception
     */
    public AuthorNagException(final String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
