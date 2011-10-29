package org.bukkit.event.player;

import org.bukkit.entity.Player;

/**
 * Called when a player leaves a server
 */
public class PlayerQuitEvent extends PlayerEvent {

    private static final long serialVersionUID = 7468625037636214692L;
    private String quitMessage;

    public PlayerQuitEvent(Player who, String quitMessage) {
        super(Type.PLAYER_QUIT, who);
        this.quitMessage = quitMessage;
    }

    /**
     * Gets the quit message to send to all online players
     *
     * @return string quit message
     */
    public String getQuitMessage() {
        return quitMessage;
    }

    /**
     * Sets the quit message to send to all online players
     *
     * @param quitMessage quit message
     */
    public void setQuitMessage(String quitMessage) {
        this.quitMessage = quitMessage;
    }
}
