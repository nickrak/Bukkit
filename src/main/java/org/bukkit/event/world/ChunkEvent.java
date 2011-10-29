package org.bukkit.event.world;

import org.bukkit.Chunk;

/**
 * Represents a Chunk related event
 */
public class ChunkEvent extends WorldEvent {
    private static final long serialVersionUID = 704927678514741242L;
    protected Chunk chunk;

    protected ChunkEvent(Type type, Chunk chunk) {
        super(type, chunk.getWorld());
        this.chunk = chunk;
    }

    /**
     * Gets the chunk being loaded/unloaded
     *
     * @return Chunk that triggered this event
     */
    public Chunk getChunk() {
        return chunk;
    }
}
