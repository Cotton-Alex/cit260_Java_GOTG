/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import Control.GameControl;
import Exceptions.GameControlException;
import GOTG.GOTG;
import Model.Game;
import Model.Item;
import Model.ItemType;

/**
 *
 * @author alexcotton
 */
public class InventoryMenuView extends View{   
       
    public InventoryMenuView() {
        super("\n" + "\n----------------------------------"
                         + "\n|  Inventory                     |"
                         + "\n----------------------------------"
                         + "\nG - Groot's Inventory"
                         + "\nS - Ship's Inventory"
                         + "\nC - Display Groot's coin total "
                         + "\nF - List Groot's local companions and what they're carrying"
                         + "\nQ - Back"
                         + "\n----------------------------------");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "G": // Groot's Inventory
                this.grootsInventory();
                break;
            case "S": // Ship's Inventory
                this.shipsInventory();
                break;
            case "C": //Display Groot's coin total
                this.coinInventory();
                break;
            case "F":
                this.friendsInventory();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }
    
     

    private void grootsInventory() {
                
        
        
        int j = 0;
        Game game = GOTG.getCurrentGame();
        
        if(game.getInventory() == null){
            ErrorView.display(this.getClass().getName(),"inventory has not yet been initialized");
        }
        
         Item[] items = game.getInventory();
        
        for (int i = 0; i <ItemType.values().length; i++) {
            if(items[i].getQuantityInStock() >= 1){
             System.out.println(items[i].getItemType()); // Fix Output
                j++;
            }
            
        }
       if(j == 0){
          ErrorView.display(this.getClass().getName(),"you have no items in your inventory"); //Fix Error
           }
    }
       
    
    private void shipsInventory() {
        System.out.println(
                "*** List the items that are stored on the Groot's ship ***");
    }
    private void coinInventory() {
        System.out.println("*** Display the total coins Groot is carrying ***");
    }
    private void friendsInventory() {
        System.out.println("*** Display a list of friends working with Groot"
                          +"\n and a list of what they're carrying***");
    }
}
