/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Justin
 */
public class FuelStation extends View {
    
      public FuelStation() {
       super( "\n"
             +"\n| Fuel Station"
             +"\n----------------------------------------"
             +"\n Gathering fuel takes 1 hour and gives"
             +"\n you 100 gallons of fuel."
             +"\n Do you want fuel? Press Y for yes or"
               + "\n q to return to previous menu"  
               
       );
   }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "Y": // create and start a new game
                this.gainFuel();
                break;
           
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    
    }

    private void gainFuel() {
        this.console.println("this will add 100 gallons of fuel to the "
                + "users fuel stash");
    }

    
}
