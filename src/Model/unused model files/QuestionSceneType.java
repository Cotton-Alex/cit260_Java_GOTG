/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
/**
 *
 * @author Justin
 */
public class QuestionSceneType {
    private int noToAnswer;
    private int bonus;

    //Constructer funciton
    public QuestionSceneType() {
    }
    
    //getter and setter functions

    public int getNoToAnswer() {
        return noToAnswer;
    }

    public void setNoToAnswer(int noToAnswer) {
        this.noToAnswer = noToAnswer;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    //hash and equals functions

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.noToAnswer;
        hash = 97 * hash + this.bonus;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuestionSceneType other = (QuestionSceneType) obj;
        if (this.noToAnswer != other.noToAnswer) {
            return false;
        }
        if (this.bonus != other.bonus) {
            return false;
        }
        return true;
    }
    
    //toString funcitons

    @Override
    public String toString() {
        return "QuestionSceneType{" + "noToAnswer=" + noToAnswer + ", bonus=" + bonus + '}';
    }
    
}
