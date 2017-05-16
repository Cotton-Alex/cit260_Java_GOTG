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
public class Question implements Serializable {
    
    private int attribute;
    private int attribute1;
    
    //constructer funcion

    public Question() {
    }
    
    //getter and setter functions

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }

    public int getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(int attribute1) {
        this.attribute1 = attribute1;
    }
    
    //hash and equals funcitons

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.attribute;
        hash = 53 * hash + this.attribute1;
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
        final Question other = (Question) obj;
        if (this.attribute != other.attribute) {
            return false;
        }
        if (this.attribute1 != other.attribute1) {
            return false;
        }
        return true;
    }
    
    //toString funciton

    @Override
    public String toString() {
        return "Question{" + "attribute=" + attribute + ", attribute1=" + attribute1 + '}';
    }
    
    
    
    
}
