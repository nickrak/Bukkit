package org.bukkit.event.player;

import org.bukkit.World;
import org.bukkit.entity.Player;

public class PlayerChangedWorldEvent extends PlayerEvent {

    private static final long serialVersionUID = -551262582025456277L;
    private final World from;

    public PlayerChangedWorldEvent(Player player, World from) {
        super(Type.PLAYER_CHANGED_WORLD, player);
        this.from = from;
    }

    public World getFrom() {
        return from;
    }
}
