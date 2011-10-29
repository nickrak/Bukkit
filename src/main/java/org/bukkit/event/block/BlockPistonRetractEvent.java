package org.bukkit.event.block;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class BlockPistonRetractEvent extends BlockPistonEvent {
    private static final long serialVersionUID = -7319683708298510960L;

    public BlockPistonRetractEvent(Block block, BlockFace direction) {
        super(Type.BLOCK_PISTON_RETRACT, block, direction);
    }

    /**
     * Gets the location where the possible moving block might be if the retracting
     * piston is sticky.
     *
     * @return The possible location of the possibly moving block.
     */
    public Location getRetractLocation() {
        return getBlock().getRelative(getDirection(), 2).getLocation();
    }
}
