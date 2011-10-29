package org.bukkit.event.world;

import org.bukkit.World;

/**
 * Called when a World is loaded
 */
public class WorldLoadEvent extends WorldEvent {
    private static final long serialVersionUID = 5444675274340014286L;

    public WorldLoadEvent(World world) {
        super(Type.WORLD_LOAD, world);
    }
}
