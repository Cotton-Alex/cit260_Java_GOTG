/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Justin
 */
public class calcTimeRemaining {
    
    public int CalcTimeRemaining(int timeUsed, int timeRemaining){
   
        int timeLeft = 0;

    if (timeRemaining <0 || timeUsed < 0 ) 
    return -999;
    else if (timeRemaining - timeUsed <0)
    return -999;        
    else        
timeLeft = timeRemaining - timeUsed;

timeRemaining = timeLeft;

return timeRemaining;


    }
}
