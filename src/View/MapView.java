/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.MapControl;
import Exceptions.MapControlExceptions;
import GOTG.GOTG;
import Model.Game;
import Model.Location;
import Model.Map;

/**
 *
 * @author Justin
 */
public class MapView extends View {
//private final String map;

    private Boolean sectorJump;

    public MapView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n Enter your desired location "
                + "\n------------------------------------------");
    }

    @Override
    public void display() {
        Game game = GOTG.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        if (sectorJump && map.getCurrentColumn() != 0) {
            ErrorView.display(this.getClass().getName(),"You can't jump sectors without being at a dock");
            return;
        }

        super.display();
    }

    @Override
    public boolean doAction(String mapOption) {
        mapOption = mapOption.toUpperCase();
        Game game = GOTG.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[row].length; column++) {
                if (locations[row][column].getScene() != null) {
                    if (mapOption.equals(locations[row][column].getScene().getSymbol())) {
                        if (sectorJump && column != 0) {
                            ErrorView.display(this.getClass().getName(),"You can't land your ship here, you must land at a sector dock.");
                            return false;
                        }
                        if (!sectorJump && map.getCurrentRow() != row) {
                            ErrorView.display(this.getClass().getName(),"You must stay in the same sector. ");
                            return false;
                        }
                        try {
                            MapControl.movePlayer(map, row, column);
                            return true;
                        } catch (MapControlExceptions mce) {
                            this.console.println(mce.getMessage());
                        }
                    }

                }
            }
        }
        ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try Again later");
        return false;
    }

    public void setSectorJump(Boolean sectorJump) {
        this.sectorJump = sectorJump;
    }

}
