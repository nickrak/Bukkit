package org.bukkit.event.server;

import org.bukkit.plugin.Plugin;

/**
 * Called when a plugin is enabled.
 */
public class PluginEnableEvent extends PluginEvent {
    private static final long serialVersionUID = 4721763556205291036L;

    public PluginEnableEvent(Plugin plugin) {
        super(Type.PLUGIN_ENABLE, plugin);
    }
}
