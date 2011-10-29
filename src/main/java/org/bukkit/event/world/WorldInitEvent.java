package org.bukkit.event.world;

import org.bukkit.World;

/**
 * Called when a World is initializing
 */
public class WorldInitEvent extends WorldEvent {
    private static final long serialVersionUID = 4138153058403154996L;

    public WorldInitEvent(World world) {
        super(Type.WORLD_INIT, world);
    }
}
