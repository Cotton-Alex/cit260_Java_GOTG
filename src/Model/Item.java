/*
* Item Class
 */
package Model;

import java.io.Serializable;

import java.util.Objects;

/**
 *
 * @author Mike Minassian
 */
public class Item implements Serializable {

    // class instance variables
    private ItemType itemType;
    private String name;
    private int weight;
    private int quantityInStock;
    private int requiredAmount;
    private int itemLocationCol;
    private int itemLocationRow;

    public Item() {
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

        final Item other = (Item) obj;

        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }

        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }

        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;

        hash = 59 * hash + Objects.hashCode(this.itemType);
        hash = 59 * hash + this.quantityInStock;
        hash = 59 * hash + this.requiredAmount;

        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventoryType=" + itemType + ", quantityInStock=" + quantityInStock
                + ", requiredAmount=" + requiredAmount + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }
    
    public ItemType getItemType() {
        return itemType;
    }
    
    public void setItemType(ItemType itemType) {
        this.itemType = itemType;

    public ItemType getItemType() {
        return itemType;
    }
    
    public int getItemLocationCol() {
        return itemLocationCol;
    }

    public void setItemLocationCol(int itemLocationCol) {
        this.itemLocationCol = itemLocationCol;
    }

    public int getItemLocationRow() {
        return itemLocationRow;
    }

    public void setItemLocationRow(int itemLocationRow) {
        this.itemLocationRow = itemLocationRow;
    }

}
