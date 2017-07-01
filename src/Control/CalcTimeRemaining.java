/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exceptions.CalcTimeRemainingException;

/**
 *
 * @author Justin
 */
public class CalcTimeRemaining {

    public int CalcTimeRemaining(int timeUsed, int timeRemaining)
            throws CalcTimeRemainingException {

        int timeLeft = 0; //placeholder varaible

        if (timeRemaining - timeUsed < 0) {
            throw new CalcTimeRemainingException("That would take" + timeUsed + " hours, but you only have "
                    + timeRemaining + " hours left before Thanos arrives.");
        } else {
            timeLeft = timeRemaining - timeUsed;
        }

        timeRemaining = timeLeft;

        return timeRemaining;
    }

}
