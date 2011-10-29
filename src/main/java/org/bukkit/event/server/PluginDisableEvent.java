package org.bukkit.event.server;

import org.bukkit.plugin.Plugin;

/**
 * Called when a plugin is disabled.
 */
public class PluginDisableEvent extends PluginEvent {
    private static final long serialVersionUID = -1068587977872564003L;

    public PluginDisableEvent(Plugin plugin) {
        super(Type.PLUGIN_DISABLE, plugin);
    }
}
