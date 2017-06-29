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
    Earth("Earth sector home"),
        Starlords_Home("Starlord lived here while on earth"),
        Earth_Bar("Get Infromation here"),
        Avengers_HQ("Vision is found here"),
    Hala("Hala sector home"),
        Hala_Bar("Get Information here"),
        Skrull_Palace("Hela is found here"),
        Skrull_House("Something might be left here"),
    Xandar("Xander sector home"),
        Nova_Prime("Irani Rael is found here"),
        Nova_Command("Nova keep there teasure here"),
        Mechanic("Ship Mechanic"),
    TheKyln("The Kyln sector home"),
        Boss_Quarters("You will find Yondu here"),
        Prison_Cell("Many people have shared this cell"),
        Stockpile("Prisoners things are kept here"),
    Knowhere("Knowhere sector home"),
        Command_Center("Docter Strange is found here"),
        Knowhere_Bar("Get information here"),
        Mining_Bay("Useful things were mined here"),
    MoragIV("Morag IV sector home"),
        Prison("The worst of the worst are kept here"),
        The_Collectors_Shop("The collector is found here"),
        The_Temple("this is where Starlord Found the Orb"),
    Asgard("Asgard sector home"),
        Hall_of_Relics("The Relics of Asgard are here"),
        Throne_Room("Loki is found here"),
        Bifrost("travel anywhere here");

    private final String description;
    
    SceneType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}