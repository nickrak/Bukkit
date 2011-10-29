package org.bukkit.event.player;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * Represents an event that is called when a player right clicks an entity.
 */
public class PlayerInteractEntityEvent extends PlayerEvent implements Cancellable {
    private static final long serialVersionUID = 8853163264169939127L;
    protected Entity clickedEntity;
    boolean cancelled = false;

    public PlayerInteractEntityEvent(Player who, Entity clickedEntity) {
        super(Type.PLAYER_INTERACT_ENTITY, who);
        this.clickedEntity = clickedEntity;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    /**
     * Gets the entity that was rightclicked by the player.
     *
     * @return entity right clicked by player
     */
    public Entity getRightClicked() {
        return this.clickedEntity;
    }
}
