package org.bukkit.event.world;

import org.bukkit.World;

public class WorldSaveEvent extends WorldEvent {
    private static final long serialVersionUID = 6574935326820104232L;

    public WorldSaveEvent(World world) {
        super(Type.WORLD_SAVE, world);
    }
}
