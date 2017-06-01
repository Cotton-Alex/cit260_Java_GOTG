/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Player;

/**
 *
 * @author alexcotton
 */
class GameControl {

    public static Player createPlayer(String playersName) {
        System.out.println("\n** createPlayer() function called***");
        return new Player();
    }
    
}
