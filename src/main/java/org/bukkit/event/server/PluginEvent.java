package org.bukkit.event.server;

import org.bukkit.plugin.Plugin;

/**
 * Used for plugin enable and disable events
 */
public class PluginEvent extends ServerEvent {
    private static final long serialVersionUID = -4685045678389312381L;
    private final Plugin plugin;

    public PluginEvent(final Type type, final Plugin plugin) {
        super(type);

        this.plugin = plugin;
    }

    /**
     * Gets the plugin involved in this event
     *
     * @return Plugin for this event
     */
    public Plugin getPlugin() {
        return plugin;
    }
}
