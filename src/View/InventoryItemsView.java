/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import GOTG.GOTG;
import Model.Game;
import Model.Item;
import Model.ItemType;
import java.io.PrintWriter;

/**
 *
 * @author Justin
 */
public class InventoryItemsView implements ReportInterface {
     @Override
    public void display(PrintWriter writer) {

        

        StringBuilder line;
        Game game = GOTG.getCurrentGame();
        Item[] items = game.getInventory();
        writer.println(
                "--------------------------------------------------------------\n"
                + "|                    Item Start Locations                    |\n"
                + "--------------------------------------------------------------");
        writer.println("AMOUNT\t\tITEM");
        writer.println("--------------------------------------------------------------");
        for (int i = 0; i < ItemType.values().length; i++) {
            writer.println(items[i].getQuantityInStock() +  "\t\t" + items[i].getName());
}
        writer.println("--------------------------------------------------------------");

    }
}
