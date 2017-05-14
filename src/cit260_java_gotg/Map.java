/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260_java_gotg;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Justin
 */
public class Map implements Serializable {
    
    private String description;
    private int rowCount;
    private int columnCount;
    private int currentRow;
    private int currentColumn;
    
    // constructer function

    public Map() {
    }
    
    //getter and setter funcgions

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }
    
    //hash and equals functions

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + this.rowCount;
        hash = 37 * hash + this.columnCount;
        hash = 37 * hash + this.currentRow;
        hash = 37 * hash + this.currentColumn;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    //toString fuctions

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + '}';
    }
    
    
}
