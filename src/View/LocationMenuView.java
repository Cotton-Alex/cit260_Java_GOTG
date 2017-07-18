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
import Model.Item;
import Model.ItemType;
import Model.Location;
import Model.Map;
import Model.Scene;
import Model.SceneType;

/**
 *
 * @author Mike Minassian
 */
public class LocationMenuView extends View {

    public void SceneChoice(int sceneNumber) {

        switch (sceneNumber) {
            case (0):
                this.EarthScene();
                break;
            case (1):
                this.StarLordsHome();
                break;
            case (2):
                this.EarthBar();
                break;
            case (3):
                this.EarthAvengersHQ();
                break;
            case (4):
                this.HalaScene();
                break;
            case (5):
                this.HalaBar();
                break;
            case (6):
                this.SkrullPalace();
                break;
            case (7):
                this.SkrullHouse();
                break;
            case (8):
                this.XandarScene();
                break;
            case (9):
                this.NovaPrime();
                break;
            case (10):
                this.NovaCommand();
                break;
            case (11):
                this.Mechanic();
                break;
            case (12):
                this.TheKyln();
                break;
            case (13):
                this.BossQuarters();
                break;
            case (14):
                this.PrisonCell();
                break;
            case (15):
                this.Stockpile();
                break;
            case (16):
                this.KnowhwereScene();
                break;
            case (17):
                this.CommandCenter();
                break;
            case (18):
                this.KnowhereBar();
                break;
            case (19):
                this.MiningBay();
                break;
            case (20):
                this.MorageIVScene();
                break;
            case (21):
                this.Prison();
                break;
            case (22):
                this.CollectorsShop();
                break;
            case (23):
                this.Temple();
                break;
            case (24):
                this.AsgardScene();
                break;
            case (25):
                this.HallOfrelics();
                break;
            case (26):
                this.ThroneRoom();
                break;
            case (27):
                this.Bifrost();
                break;

        }
    }

    private void EarthScene() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();
        
        if(items[ItemType.Eye_of_Agamotto.ordinal()].getQuantityInStock() == 1 && items[ItemType.aether.ordinal()].getQuantityInStock() == 1 && items[ItemType.mindStone.ordinal()].getQuantityInStock() == 1 && items[ItemType.orb.ordinal()].getQuantityInStock() == 1 && items[ItemType.soulStone.ordinal()].getQuantityInStock() == 1 & items[ItemType.tesseract.ordinal()].getQuantityInStock() == 1){
        this.console.println("\n Thantos arrives at earth and finds you waiting "
                + "           \n to meet him. You see a look of fear in "
                + "           \n his eyes when he sees the six glowing stones in"
                + "           \n your hands."
                + "\n"
                + "           \n You channel the power of the stones at Thantos!"
                + "           \n A beam of awesome raw power leaves the stones!"
                + "           \n There is just a pile of ash left where Thantos"
                + "           \n used to be."
                + "\n"
                + "           \n You have save the Galaxy from the threat of "
                + "           \n Thantos!"
                + "\n"
                + "           \n You Win!!");
        System.exit(0);
        }else{
        this.console.println("\n You are on Earth, Starlord's Home Planet.");   
        }
    }

    private void StarLordsHome() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();
        if (scenes[SceneType.Starlords_Home.ordinal()].getSceneCompleted() == 0) {
            this.console.println("\n this is starlords home, or at least it was.");
            this.console.println("\n As you look around you find his old walkman!"
                    + "           \n You feel its a good idea to take it along with "
                    + "           \n you."
                    + "\n"
                    + "           \n The Walkman has been added to your inventory!!");

            scenes[SceneType.Starlords_Home.ordinal()].setSceneCompleted(1);
            items[ItemType.walkman.ordinal()].setQuantityInStock(1);

        } else if (scenes[SceneType.Starlords_Home.ordinal()].getSceneCompleted() == 1) {
            this.console.println("\n There is nothing else you can find here");
        }

    }

    private void EarthBar() {
        this.console.println("\n As you go around the bar, you talk to some people."
                + "\n They tell you that Dr. Strange has the Eye of "
                + "           \n Agamoto somewhere on Knowhere");
    }

    private void EarthAvengersHQ() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();
        switch (scenes[SceneType.Avengers_HQ.ordinal()].getSceneCompleted()) {
            case 0:
                 if (items[ItemType.orb.ordinal()].getQuantityInStock() == 1 && items[ItemType.tesseract.ordinal()].getQuantityInStock() == 1 && items[ItemType.aether.ordinal()].getQuantityInStock() == 1 && items[ItemType.soulStone.ordinal()].getQuantityInStock() == 1 && items[ItemType.Eye_of_Agamotto.ordinal()].getQuantityInStock() == 1) {
                    this.console.println("\n Vision tells you that you have proven yourself worthy"
                            + "\n by getting the other stones and give you the Mind Stone! ");
                    
                    this.console.println("\n the Mind Stone has been added to your inventory.");
                    items[ItemType.mindStone.ordinal()].setQuantityInStock(1);
                    scenes[SceneType.Avengers_HQ.ordinal()].setSceneCompleted(2);
                }else{
                this.console.println("\n This is the Avengers HQ, you walk around and"
                        + "\n you walk around and find Vision.");
                this.console.println("\n "
                        + "\n Vision tells you that the six infinity stones are:"
                        + "\n The Mind Stone"
                        + "\n The Tesseract"
                        + "\n The Aether"
                        + "\n The Soul Stone"
                        + "\n The Eye of Agamotto"
                        + "\n And The Orb");
                this.console.println("\n Vision will give you the Mind Stone once you have"
                        + "\n collected the other stones.");
                scenes[SceneType.Avengers_HQ.ordinal()].setSceneCompleted(1);
                break;
                 }
            case 1:
                if (items[ItemType.orb.ordinal()].getQuantityInStock() == 1 && items[ItemType.tesseract.ordinal()].getQuantityInStock() == 1 && items[ItemType.aether.ordinal()].getQuantityInStock() == 1 && items[ItemType.soulStone.ordinal()].getQuantityInStock() == 1 && items[ItemType.Eye_of_Agamotto.ordinal()].getQuantityInStock() == 1) {
                    this.console.println("\n Vision tells you that you have proven yourself worthy"
                            + "\n by getting the other stones and give you the Mind Stone! ");
                    
                    this.console.println("\n the Mind Stone has been added to your inventory.");
                    items[ItemType.mindStone.ordinal()].setQuantityInStock(1);
                    scenes[SceneType.Avengers_HQ.ordinal()].setSceneCompleted(2);
                } else {
                    this.console.println("\n Vision tells you to come back after you get"
                            + "\n all the stones"
                            + "\n he also reminds you that the stones are:"
                            + "\n The Mind Stone"
                            + "\n The Tesseract"
                            + "\n The Aether"
                            + "\n The Soul Stone"
                            + "\n The Eye of Agamotto"
                            + "\n And The Orb");
                }   break;
            case 2:
                this.console.println("/n Vision tells you to end the threat of "
                        + "\n Thantos now you have all the stones");
                break;
        }
    }

    private void HalaScene() {
        this.console.println("\n This is Hala, home of the Skrull.");
    }

    private void HalaBar() {
        this.console.println("\n As you go around the bar, you talk to some people."
                + "\n They tell you that The Collector has the Aether "
                + "           \n somewhere on Morag IV.");
    }

    private void SkrullPalace() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.Skrull_Palace.ordinal()].getSceneCompleted()) {
            case 0:
                if (items[ItemType.knowledge_of_the_soulstone.ordinal()].getQuantityInStock() == 1) {
                    this.console.println("\n You enter the Skrull Palace and "
                            + "           \n find Hela. She tells you that Loki"
                            + "           \n has the Tesseract.");

                    this.console.println("\n Knowing that she is the Soul Stone,"
                            + "           \n you confront her about it. Hela then"
                            + "           \n gives up her deception and agrees to"
                            + "           \n led you her power.");

                    this.console.println("\n You recive the Soul Stone!");
                    items[ItemType.soulStone.ordinal()].setQuantityInStock(1);
                    items[ItemType.knowledge_of_the_soulstone.ordinal()].setQuantityInStock(0);
                    scenes[SceneType.Skrull_Palace.ordinal()].setSceneCompleted(1);
                    break;

                } else {
                    this.console.println("\n You enter the Skrull Palace and "
                            + "           \n find Hela. She tells you that Loki"
                            + "           \n has the Tesseract.");
                }
                break;
            case 1:
                this.console.println("\n Hela says there is nothing more she can"
                        + "           \n do for you.");
                break;
        }
    }

    private void SkrullHouse() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.Skrull_House.ordinal()].getSceneCompleted()) {
            case 0:
                this.console.println("\n You search this strange house and find"
                        + "           \n some money! You cant argue with that!");

                this.console.println("\n $500 was added to your inventory.");
                items[ItemType.money.ordinal()].setQuantityInStock(items[ItemType.money.ordinal()].getQuantityInStock() + 500);
                scenes[SceneType.Skrull_House.ordinal()].setSceneCompleted(1);
                break;
            case 1:
                this.console.println("\n There is nothing more that you can find"
                        + "           \n here.");
                break;
        }
    }

    private void XandarScene() {
        this.console.println("\n This is Xandar, home of the Nova Core.");
    }

    private void NovaPrime() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.Nova_Prime.ordinal()].getSceneCompleted()) {
            case 0:
                if (items[ItemType.walkman.ordinal()].getQuantityInStock() == 1) {
                    this.console.println("\n You walk into Nova Prime and find"
                            + "           \n Irani Rael. You address her "
                            + "           \n respectfuly and tell her about your "
                            + "           \n mission."
                            + "\n"
                            + "           \n She says that she has the Orb but"
                            + "           \n she wont give it to you with out "
                            + "           \n some kind of item that you would "
                            + "           \n come back for as collateral.");

                    this.console.println("\n To Starlords dismay, you offer her"
                            + "           \n the walkman as collateral."
                            + "\n"
                            + "           \n She then give a command to one of "
                            + "           \n her men nearby and says to go to"
                            + "           \n Nova Command to recieve the Orb.");
                    items[ItemType.walkman.ordinal()].setQuantityInStock(0);
                    scenes[SceneType.Nova_Command.ordinal()].setSceneCompleted(1);
                    scenes[SceneType.Nova_Prime.ordinal()].setSceneCompleted(2);
                    break;
                } else {
                    this.console.println("\n You walk into Nova Prime and find"
                            + "           \n Irani Rael. You address her "
                            + "           \n respectfuly and tell her about your "
                            + "           \n mission."
                            + "\n"
                            + "           \n She says that she has the Orb but"
                            + "           \n she wont give it to you with out "
                            + "           \n some kind of item that you would "
                            + "           \n come back for as collateral.");
                    scenes[SceneType.Nova_Prime.ordinal()].setSceneCompleted(1);
                    break;
                }
            case 1:
                if (items[ItemType.walkman.ordinal()].getQuantityInStock() == 1) {
                    this.console.println("\n To Starlords dismay, you offer her"
                            + "           \n the walkman as collateral."
                            + "\n"
                            + "           \n She then give a command to one of "
                            + "           \n her men nearby and says to go to"
                            + "           \n Nova Command to recieve the Orb.");
                    items[ItemType.walkman.ordinal()].setQuantityInStock(0);
                    scenes[SceneType.Nova_Command.ordinal()].setSceneCompleted(1);
                    scenes[SceneType.Nova_Prime.ordinal()].setSceneCompleted(2);
                    break;
                } else {
                    this.console.println("\n Irani tells you to come back once you"
                            + "           \n have some collateral.");
                    break;
                }
            case 2:
                this.console.println("\n Irani says there is nothing more that she "
                        + "           \n can do for you.");
                break;

        }
    }

    private void NovaCommand() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.Nova_Command.ordinal()].getSceneCompleted()) {
            case 0:
                this.console.println("\n The Guard says that you cant be here "
                        + "           \n and to come back once Irani says its "
                        + "           \n okay.");
                break;
            case 1:
                this.console.println("\n The Guard tells you that he got word "
                        + "           \n from Irani to give you the Orb.");
                this.console.println("\n The Orb has been added to your inventory!");
                items[ItemType.orb.ordinal()].setQuantityInStock(1);
                scenes[SceneType.Nova_Command.ordinal()].setSceneCompleted(2);
                break;
            case 2:
                this.console.println("\n The Guard tells you that he already"
                        + "           \n gave you the Orb and to get lost.");
                break;

        }
    }

    private void Mechanic() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.Mechanic.ordinal()].getSceneCompleted()) {
            case 0:
                this.console.println("\n You enter the Mechanics shop and ask him"
                        + "           \n what he could do for you. He says that"
                        + "           \n for $500 he can make your ship get "
                        + "           \n better gas mileage."
                        + "\n");
                this.console.println("\n Do you what to pay $500 to cut fuel"
                        + "           \n cost in half while traveling?"
                        + "           \n Y for yes or N for no.");
                String response = this.getInput();
                response = response.toUpperCase();
                switch (response) {
                    case "Y":
                        if (items[ItemType.money.ordinal()].getQuantityInStock() >= 500) {
                            items[ItemType.money.ordinal()].setQuantityInStock(items[ItemType.money.ordinal()].getQuantityInStock() - 500);
                            items[ItemType.eco_Boost.ordinal()].setQuantityInStock(1);
                            scenes[SceneType.Mechanic.ordinal()].setSceneCompleted(1);
                            this.console.println("\n The Eco-Boost has been installed"
                                    + "           \n on your ship.");
                            break;
                        } else {
                            ErrorView.display(this.getClass().getName(), "\nYou do not have enough money. Try again later");
                            break;
                        }
                    case "N":
                        break;
                    default:
                        ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                        break;

                }
                break;
            case 1:
                this.console.println("\n The mechanic says there is nothing more"
                        + "           \n he can do for you.");
                break;
        }
    }

    private void TheKyln() {
        this.console.println("\n This is The Kyln, Yondu currently controls it.");
    }

    private void BossQuarters() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.Boss_Quarters.ordinal()].getSceneCompleted()) {
            case 0:
                if (items[ItemType.yondus_Headpiece.ordinal()].getQuantityInStock() == 1) {
                    this.console.println("\n You find Yondu in his chair and you"
                            + "           \n joke around and catch up. He tells "
                            + "           \n you that his headpiece was stolen."
                            + "           \n he says that if you get if back for "
                            + "           \n him, then he will tell you where to"
                            + "           \n find the Soul Stone. "
                            + "           \n"
                            + "           \n He says that his headpiece was lost "
                            + "           \n somewhere on Morag IV where low lives"
                            + "           \n are kept."
                            + "\n");
                    this.console.println("\n You show Youndu the HeadPice. He says"
                            + "           \n a deal is a deal, the Soul Stone is"
                            + "           \n Hela herself!");

                    this.console.println("\n You should go confront Hela with your"
                            + "           \n new found knowledge.");
                    items[ItemType.yondus_Headpiece.ordinal()].setQuantityInStock(0);
                    items[ItemType.knowledge_of_the_soulstone.ordinal()].setQuantityInStock(1);
                    scenes[SceneType.Boss_Quarters.ordinal()].setSceneCompleted(2);
                    break;
                } else {
                    this.console.println("\n You find Yondu in his chair and you"
                            + "           \n joke around and catch up. He tells "
                            + "           \n you that his headpiece was stolen."
                            + "           \n he says that if you get if back for "
                            + "           \n him, then he will tell you where to"
                            + "           \n find the Soul Stone. "
                            + "           \n"
                            + "           \n He says that his headpiece was lost "
                            + "           \n somewhere on Morag IV where low lives"
                            + "           \n are kept."
                            + "\n");
                    scenes[SceneType.Boss_Quarters.ordinal()].setSceneCompleted(1);
                    break;

                }
            case 1:
                if (items[ItemType.yondus_Headpiece.ordinal()].getQuantityInStock() == 1) {
                    this.console.println("\n You show Youndu the HeadPice. He says"
                            + "           \n a deal is a deal, the Soul Stone is"
                            + "           \n Hela herself!");

                    this.console.println("\n You should go confront Hela with your"
                            + "           \n new found knowledge.");
                    items[ItemType.yondus_Headpiece.ordinal()].setQuantityInStock(0);
                    items[ItemType.knowledge_of_the_soulstone.ordinal()].setQuantityInStock(1);
                    scenes[SceneType.Boss_Quarters.ordinal()].setSceneCompleted(2);
                    break;
                } else {
                    this.console.println("\n Yondu says to come back once you get "
                            + "           \n the headpiece"
                            + "\n"
                            + "          \n He says that his headpiece was lost "
                            + "         \n somewhere on Morag IV where low lives"
                            + "         \n are kept.");
                    break;
                }
            case 2:
                this.console.println("\n Yondu says there is nothing more that "
                        + "           \n he can do for you.");

        }
    }

    private void PrisonCell() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.Prison_Cell.ordinal()].getSceneCompleted()) {
            case 0:
                this.console.println("\n You search this strange cell and find"
                        + "           \n some money! You cant argue with that!");

                this.console.println("\n $500 was added to your inventory.");
                items[ItemType.money.ordinal()].setQuantityInStock(items[ItemType.money.ordinal()].getQuantityInStock() + 500);
                scenes[SceneType.Prison_Cell.ordinal()].setSceneCompleted(1);
                break;
            case 1:
                this.console.println("\n There is nothing more that you can find"
                        + "           \n here.");
                break;
        }
    }

    private void Stockpile() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.Stockpile.ordinal()].getSceneCompleted()) {
            case 0:
                this.console.println("\n You enter the Stockpile and Find one of"
                        + "           \n Yondu's men guarding his treasure."
                        + "           \n He says that for $500 he will steal"
                        + "           \n Drax's Knives for you. "
                        
                        + "\n");
                this.console.println("\n Do you what to pay $500 to get Drax's Knives?"
                    
                        + "           \n Y for yes or N for no.");
                String response = this.getInput();
                response = response.toUpperCase();
                switch (response) {
                    case "Y":
                        if (items[ItemType.money.ordinal()].getQuantityInStock() >= 500) {
                            items[ItemType.money.ordinal()].setQuantityInStock(items[ItemType.money.ordinal()].getQuantityInStock() - 500);
                            items[ItemType.drax_Knives.ordinal()].setQuantityInStock(1);
                            scenes[SceneType.Stockpile.ordinal()].setSceneCompleted(1);
                            this.console.println("\n You recive Drax's Knives");
                                   
                            break;
                        } else {
                            ErrorView.display(this.getClass().getName(), "\nYou do not have enough money. Try again later");
                            break;
                        }
                    case "N":
                        break;
                    default:
                        ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                        break;

                }
                break;
            case 1:
                this.console.println("\n The Man says there is nothing more"
                        + "           \n he can do for you.");
                break;
        }
    }

    private void KnowhwereScene() {
        this.console.println("\n This is Knowhere, there is a sorcerer somewhere "
                + "           \n here.");
    }

    private void CommandCenter() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.Command_Center.ordinal()].getSceneCompleted()) {
            case 0:
                this.console.println("\n You find Doctor Strange pouring over "
                        + "           \n some strange book. You walk over to him"
                        + "           \n and tell him about your quest."
                        + "\n");
                this.console.println("\n He tells you that saving the Galaxy is"
                        + "           \n also his responsability and he agrees "
                        + "           \n to let you use the Eye of Agamotto."
                        + "\n");
                this.console.println("\n The Eye of Agamotto was added to your "
                        + "           \n inventory!");
                items[ItemType.Eye_of_Agamotto.ordinal()].setQuantityInStock(1);
                scenes[SceneType.Command_Center.ordinal()].setSceneCompleted(1);
                break;
            case 1:
                this.console.println("\n Strange tells you there is nothing more "
                        + "           \n he can do for you.");
                break;

        }
    }

    private void KnowhereBar() {
        this.console.println("\n You go around the bar and talk to some people."
                + "           \n They tell you that Loki has been spotted in "
                + "           \n Asgard.");
    }

    private void MiningBay() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.Mining_Bay.ordinal()].getSceneCompleted()) {
            case 0:
                this.console.println("\n You search this strange mine and find"
                        + "           \n some money! You cant argue with that!");

                this.console.println("\n $500 was added to your inventory.");
                items[ItemType.money.ordinal()].setQuantityInStock(items[ItemType.money.ordinal()].getQuantityInStock() + 500);
                scenes[SceneType.Mining_Bay.ordinal()].setSceneCompleted(1);
                break;
            case 1:
                this.console.println("\n There is nothing more that you can find"
                        + "           \n here.");
                break;
        }
    }

    private void MorageIVScene() {
        this.console.println("\n This is Morage IV, The Collector's shop is "
                + "           \n found here.");
    }

    private void Prison() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.Prison.ordinal()].getSceneCompleted()) {
            case 0:
                this.console.println("\n You search this Prison and find"
                        + "           \n Yondu's Headpiece. how did he lose it "
                        + "           \n here?");

                this.console.println("\n Yondu's Headpiece was added to your "
                        + "           \n inventory.");
                items[ItemType.yondus_Headpiece.ordinal()].setQuantityInStock(1);
                scenes[SceneType.Prison.ordinal()].setSceneCompleted(1);
                break;
            case 1:
                this.console.println("\n There is nothing more that you can find"
                        + "           \n here.");
                break;
        }
    }

    private void CollectorsShop() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.The_Collectors_Shop.ordinal()].getSceneCompleted()) {
            case 0:
                if (items[ItemType.drax_Knives.ordinal()].getQuantityInStock() == 1) {
                    this.console.println("\n You enter the collectors shop and "
                            + "           \n you begin to look around the shop"
                            + "           \n you see the Aether in a display case."
                            + "           \n it isn't long before the Collector"
                            + "           \n comes out and asks you what you are"
                            + "           \n doing."
                            + "\n");
                    this.console.println("\n You tell the collector about your "
                            + "           \n mission and ask him to let you "
                            + "           \n use the Aether. He says he will let "
                            + "           \n you use it if you get him Drax's"
                            + "           \n knives."
                            + "\n");
                    this.console.println("\n He says you might want to check The"
                            + "           \n Kyln for them. He said he heard they"
                            + "           \n have a stockpile of random things."
                            + "\n");
                    this.console.println("\n You hand him the knives and he "
                            + "           \n reluctantly hands over the Aether."
                            + "\n ");
                    this.console.println("\n The Aether was added to your "
                            + "           \n inventory!");
                    items[ItemType.drax_Knives.ordinal()].setQuantityInStock(0);
                    items[ItemType.aether.ordinal()].setQuantityInStock(1);
                    scenes[SceneType.The_Collectors_Shop.ordinal()].setSceneCompleted(2);
                    break;

                } else {
                    this.console.println("\n You enter the collectors shop and "
                            + "           \n you begin to look around the shop"
                            + "           \n you see the Aether in a display case."
                            + "           \n it isn't long before the Collector"
                            + "           \n comes out and asks you what you are"
                            + "           \n doing."
                            + "\n");
                    this.console.println("\n You tell the collector about your "
                            + "           \n mission and ask him to let you "
                            + "           \n use the Aether. He says he will let "
                            + "           \n you use it if you get him Drax's"
                            + "           \n knives."
                            + "\n");
                    this.console.println("\n He says you might want to check The"
                            + "           \n Kyln for them. He said he heard they"
                            + "           \n have a stockpile of random things."
                            + "\n");
                    scenes[SceneType.The_Collectors_Shop.ordinal()].setSceneCompleted(1);
                    break;
                }
            case 1:
                if (items[ItemType.drax_Knives.ordinal()].getQuantityInStock() == 1) {
                    this.console.println("\n You hand him the knives and he "
                            + "           \n reluctantly hands over the Aether."
                            + "\n ");
                    this.console.println("\n The Aether was added to your "
                            + "           \n inventory!");
                    items[ItemType.drax_Knives.ordinal()].setQuantityInStock(0);
                    items[ItemType.aether.ordinal()].setQuantityInStock(1);
                    scenes[SceneType.The_Collectors_Shop.ordinal()].setSceneCompleted(2);
                    break;
                } else {
                    this.console.println("\n The Collector tells you to come back"
                            + "           \n when you have the knives"
                            + "\n");
                    this.console.println("\n He says you might want to check The"
                            + "           \n Kyln for them. He said he heard they"
                            + "           \n have a stockpile of random things."
                            + "\n");
                    break;
                }
            case 2:
                this.console.println("\n The Collector says that there is nothing"
                        + "           \n more he can do for you.");
                break;
        }
    }

    private void Temple() {
        this.console.println("\n Starlord tells you of the time he visited this "
                + "           \n temple and found the Orb."
                + "\n");
        this.console.println("\n Didn't he leave the Orb with Nova Core?");
    }

    private void AsgardScene() {
        this.console.println("\n This is Asgard, once home to Thor.");
    }

    private void HallOfrelics() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.Hall_of_Relics.ordinal()].getSceneCompleted()) {
            case 0:
                this.console.println("\n You come to a locked door but you can"
                        + "           \n see the Tesseract through the door."
                        + "\n");
                this.console.println("\n You better go talk to whoever is "
                        + "           \n in charge of this place");
                break;
            case 1:
                this.console.println("\n You put the Vault key in the lock and "
                        + "           \n the door openes. You grab the Tesseract."
                        + "\n");
                this.console.println("\n The Tesseract has been added to your"
                        + "           \n inventory!");
                items[ItemType.tesseract.ordinal()].setQuantityInStock(1);
                items[ItemType.vault_Key.ordinal()].setQuantityInStock(0);
                scenes[SceneType.Hall_of_Relics.ordinal()].setSceneCompleted(2);
                break;
            case 2:
                this.console.println("\n You alread got the Tesseract, you shouldn't"
                        + "           \n take anything else here.");
                break;
        }
    }

    private void ThroneRoom() {
        Game game = GOTG.getCurrentGame();
        Scene[] scenes = game.getScenes();
        Item[] items = game.getInventory();

        switch (scenes[SceneType.Throne_Room.ordinal()].getSceneCompleted()) {
            case 0:
                this.console.println("\n You enter the throne room to find Loki"
                        + "           \n sitting on the throne. You tell Loki "
                        + "           \n about your quest."
                        + "\n"
                        + "           \n He says that he wants Thantos dead too"
                        + "           \n so that he will stop hunting him down."
                        + "           \n he will let you take the Vault Key to"
                        + "           \n get the Tesseract from the Hall of Relics."
                        + "\n");
                this.console.println("\n The Vault Key has been added to your "
                        + "           \n inventory");
                items[ItemType.vault_Key.ordinal()].setQuantityInStock(1);
                scenes[SceneType.Throne_Room.ordinal()].setSceneCompleted(1);
                scenes[SceneType.Hall_of_Relics.ordinal()].setSceneCompleted(1);
                break;
            case 1:
                this.console.println("\n Loki tells you to leave before he "
                        + "           \n changes his mind on wanting to help you.");
                break;

        }
    }

    private void Bifrost() {
        this.console.println("\n This Place lets you move to any sector"
                + "           \n free of fuel and time."
                + "\n"
                + "           \n Would you like to move (Y/N)");
        String response = this.getInput();
        response = response.toUpperCase();
        switch (response) {
            case "Y":
                StarMapMenuView StarMapView = new StarMapMenuView();
                StarMapView.displayStarMap();
                
                
                displayB();
                StarMapView.displayStarMap();
                break;
            
            case "N":
                break;
            
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;
        
    }

//    private class console {
//
//        public console() {
//        }
//    }
}
    public void displayB() {
        Game game = GOTG.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        

        super.display();
    }
    public boolean doActionB(String mapOption) {
        mapOption = mapOption.toUpperCase();
        Game game = GOTG.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[row].length; column++) {
                if (locations[row][column].getScene() != null) {
                    if (mapOption.equals(locations[row][column].getScene().getSymbol())) {
                        
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
}
