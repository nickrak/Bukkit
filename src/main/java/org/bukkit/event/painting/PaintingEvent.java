package org.bukkit.event.painting;

import org.bukkit.entity.Painting;
import org.bukkit.event.Event;

/**
 * Represents a painting-related event.
 */
public class PaintingEvent extends Event {

    private static final long serialVersionUID = 7115782816619739258L;
    protected Painting painting;

    protected PaintingEvent(final Type type, final Painting painting) {
        super(type);
        this.painting = painting;
    }

    /**
     * Gets the painting involved in this event.
     *
     * @return the painting
     */
    public Painting getPainting() {
        return painting;
    }
}
