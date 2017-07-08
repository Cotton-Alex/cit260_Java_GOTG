/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Mike Minassian
 */
public class TimeControl {

    int timeNeeded;

    public int gettimeNeeded(int quadrantCount, int sectorCount) {

        if (quadrantCount < 0) {
            return -1; //quadrant count is too small
        } else if (sectorCount < 0) {
            return -2; //sector count is too small
        } else if (quadrantCount > 5) {
            return -3; //quadrant count is too high
        } else if (sectorCount > 6) {
            return -4; //sector count is too high
        } else {
            timeNeeded = (quadrantCount * 3) + (sectorCount * 1);
        }
        return timeNeeded;

}
}
