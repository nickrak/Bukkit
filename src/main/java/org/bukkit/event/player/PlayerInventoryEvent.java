package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Represents a player related inventory event
 */
public class PlayerInventoryEvent extends PlayerEvent {
    private static final long serialVersionUID = -7265235502044137802L;
    protected Inventory inventory;

    public PlayerInventoryEvent(final Player player, final Inventory inventory) {
        super(Type.PLAYER_INVENTORY, player);
        this.inventory = inventory;
    }

    /**
     * Gets the Inventory involved in this event
     *
     * @return Inventory
     */
    public Inventory getInventory() {
        return inventory;
    }
}
