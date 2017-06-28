/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author alexcotton
 */
public enum SceneType implements Serializable {
    //TODO: names of all 28 scenes
    Earth("Earth"),
        Home(""),
        
    Hala("Hala"),
    Xandar("Xander"),
    TheKyln("The Kyln"),
    Knowhere("Knowhere"),
    MoragIV("Morag IV"),
    Thanos("Thanos");

    private final String description;
    
    SceneType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}