/*
 *The Actor Class
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Mike Minassian
 */

public enum Actor implements Serializable{
    
    Starlord(""),
    Gamora(""),
    Drax(""),
    Rocket(""),
    Groot(""),
    Yondu(""),
    Thanos("")
}
    
//class instance variables
    
    private final String description;
    private final Point coordinates;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }


    public int getCoordinates() {
        return coordinates;
    }
}