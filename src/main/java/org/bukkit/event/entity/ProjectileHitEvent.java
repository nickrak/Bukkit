package org.bukkit.event.entity;

import org.bukkit.entity.Projectile;

/**
 * Called when a projectile hits an object
 */
public class ProjectileHitEvent extends EntityEvent {

    private static final long serialVersionUID = 9014380504074999964L;

    public ProjectileHitEvent(Projectile projectile) {
        super(Type.PROJECTILE_HIT, projectile);
    }

}
