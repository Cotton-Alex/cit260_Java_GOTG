/*
 * fuel needed control class
 */
package Control;

/**
 *
 * @author Mike Minassian
 */
public class FuelNeededControl {
    
    int fuelNeeded;
    
    public int getFuelNeeded(int quadrantCount, int sectorCount){
        
        if (quadrantCount < 0)
            return -1; //quadrant count is too small
        else if (sectorCount < 0)
            return -2; //sector count is too small
        else if (quadrantCount > 5)
            return -3; //quadrant count is too high
        else if (sectorCount > 6)
            return -4; //sector count is too high
        else
           fuelNeeded = (quadrantCount * 5)+(sectorCount * 1);
            return fuelNeeded;
    }
}
