/*
 *The Sector Class
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author alexcotton
 */
public enum Sector implements Serializable {

    Earth(""),
    Hala(""),
    Xandar(""),
    TheKyln(""),
    Knowhere(""),
    MoragIV(""),
    Thanos("");

    private final String description;
    private final Point coordinates;
}

Sector(String description) {
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
