package org.bukkit.event.world;

import org.bukkit.Chunk;
import org.bukkit.generator.BlockPopulator;

/**
 * Thrown when a new chunk has finished being populated.
 *
 * If your intent is to populate the chunk using this event, please see {@link BlockPopulator}
 */
public class ChunkPopulateEvent extends ChunkEvent {
    private static final long serialVersionUID = -5828038650883523797L;

    public ChunkPopulateEvent(final Chunk chunk) {
        super(Type.CHUNK_POPULATED, chunk);
    }
}
