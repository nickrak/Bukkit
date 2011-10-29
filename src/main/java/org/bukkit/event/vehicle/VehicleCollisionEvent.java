package org.bukkit.event.vehicle;

import org.bukkit.entity.Vehicle;

/**
 * Raised when a vehicle collides.
 */
public class VehicleCollisionEvent extends VehicleEvent {
    private static final long serialVersionUID = -6451381445441833933L;

    public VehicleCollisionEvent(Type type, Vehicle vehicle) {
        super(type, vehicle);
    }
}
