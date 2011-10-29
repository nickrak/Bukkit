package org.bukkit.event.vehicle;

import org.bukkit.entity.Vehicle;

public class VehicleUpdateEvent extends VehicleEvent {
    private static final long serialVersionUID = -3722423672999299210L;

    public VehicleUpdateEvent(Vehicle vehicle) {
        super(Type.VEHICLE_UPDATE, vehicle);
    }
}
