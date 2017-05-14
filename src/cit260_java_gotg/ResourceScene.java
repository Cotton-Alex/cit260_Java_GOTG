/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260_java_gotg;

import java.io.Serializable;

/**
 *
 * @author plex
 */
public class ResourceScene {
    public class ResrouceScene implements Serializable{
    private double amount;

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public ResrouceScene(double amount) {
            this.amount = amount;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 41 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final ResrouceScene other = (ResrouceScene) obj;
            if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "ResrouceScene{" + "amount=" + amount + '}';
        }
    
}
