package org.bukkit.event.vehicle;

import org.bukkit.entity.Vehicle;

/**
 * Raised when a vehicle is created.
 */
public class VehicleCreateEvent extends VehicleEvent {
    private static final long serialVersionUID = 8355678728754478087L;

    public VehicleCreateEvent(Vehicle vehicle) {
        super(Type.VEHICLE_CREATE, vehicle);
    }
}
