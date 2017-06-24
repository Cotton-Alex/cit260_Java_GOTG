/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260_java_gotg;

import java.io.Serializable;
import javafx.scene.Scene;
//import java.util.Objects;

/**
 *
 * @author alexcotton
 */
public class Location implements Serializable {
    
    private int row;
    private int column;
    private int visited;
    private int amountRemaining;
   
// constructer function
   
    public Location() {
    }
    
//getter & setter functions

    public int getRow() {
        return row;
    }

    public void setRow(int Row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int Column) {
        this.column = column;
    }

    public int getVisited() {
        return visited;
    }

    public void setVisited(int Visited) {
        this.visited = visited;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int AmountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.row;
        hash = 29 * hash + this.column;
        hash = 29 * hash + this.visited;
        hash = 29 * hash + this.amountRemaining;
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }

    public void setScene(Scene scene) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
    
}
