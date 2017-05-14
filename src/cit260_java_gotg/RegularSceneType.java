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
 * @author plex
 */
public class RegularSceneType implements Serializable {
    
    private String description;
    private String blocked;
    private String symbol;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getBlocked() {
            return blocked;
        }

        public void setBlocked(String blocked) {
            this.blocked = blocked;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public RegularSceneType(String description, String blocked, String symbol) {
            this.description = description;
            this.blocked = blocked;
            this.symbol = symbol;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 97 * hash + Objects.hashCode(this.description);
            hash = 97 * hash + Objects.hashCode(this.blocked);
            hash = 97 * hash + Objects.hashCode(this.symbol);
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
            final RegularSceneType other = (RegularSceneType) obj;
            if (!Objects.equals(this.description, other.description)) {
                return false;
            }
            if (!Objects.equals(this.blocked, other.blocked)) {
                return false;
            }
            if (!Objects.equals(this.symbol, other.symbol)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "RegularSceneType{" + "description=" + description + ", blocked=" + blocked + ", symbol=" + symbol + '}';
        }
    
    
}
