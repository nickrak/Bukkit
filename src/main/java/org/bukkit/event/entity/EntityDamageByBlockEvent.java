package org.bukkit.event.entity;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;

/**
 * Called when an entity is damaged by a block
 */
public class EntityDamageByBlockEvent extends EntityDamageEvent {

    private static final long serialVersionUID = -4958409428486853169L;
    private Block damager;

    public EntityDamageByBlockEvent(Block damager, Entity damagee, DamageCause cause, int damage) {
        super(Type.ENTITY_DAMAGE, damagee, cause, damage);
        this.damager = damager;
    }

    /**
     * Returns the block that damaged the player.
     *
     * @return Block that damaged the player
     */
    public Block getDamager() {
        return damager;
    }
}
