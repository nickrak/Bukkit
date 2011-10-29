package org.bukkit.event.server;

import org.bukkit.event.Event;

/**
 * Miscellaneous server events
 */
public class ServerEvent extends Event {
    private static final long serialVersionUID = 914083256651437768L;

    public ServerEvent(final Type type) {
        super(type);
    }
}
