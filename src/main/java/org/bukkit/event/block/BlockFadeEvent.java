package org.bukkit.event.block;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.event.Cancellable;
/**
 * Called when a block fades, melts or disappears based on world conditions
 * <p />
 * Examples:
 * <ul>
 *     <li>Snow melting due to being near a light source.</li>
 *     <li>Ice melting due to being near a light source.</li>
 * </ul>
 * <p />
 * If a Block Fade event is cancelled, the block will not fade, melt or disappear.
 */
public class BlockFadeEvent extends BlockEvent implements Cancellable {
    private static final long serialVersionUID = 2984729898097579566L;
    private boolean cancelled;
    private BlockState newState;

    public BlockFadeEvent(Block block, BlockState newState) {
        super(Type.BLOCK_FADE, block);
        this.newState = newState;
        this.cancelled = false;
    }

    /**
     * Gets the state of the block that will be fading, melting or disappearing.
     *
     * @return The block state of the block that will be fading, melting or disappearing
     */
    public BlockState getNewState() {
        return newState;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
}
