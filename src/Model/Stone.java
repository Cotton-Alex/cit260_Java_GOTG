/*
 *The Stone Class
 */
package Model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author alexcotton
 */
public enum Stone implements Serializable {

    RealityStone(""),
    SpaceStone(""),
    MindStone(""),
    TimeStone(""),
    PowerStone(""),
    SoulStone("");

    private final String description;
    private final Point coordinates;


Stone(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
}
