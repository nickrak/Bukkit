package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * Called when a player toggles their sprinting state
 */
public class PlayerToggleSprintEvent extends PlayerEvent implements Cancellable {
    private static final long serialVersionUID = 8069120068473380550L;
    private boolean isSprinting;
    private boolean cancel = false;

    public PlayerToggleSprintEvent(final Player player, boolean isSprinting) {
        super(Type.PLAYER_TOGGLE_SPRINT, player);
        this.isSprinting = isSprinting;
    }

    /**
     * Gets whether the player is now sprinting or not.
     *
     * @return sprinting state
     */
    public boolean isSprinting() {
        return isSprinting;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}