
package mypackage;

import java.util.Objects;


public class Bunny {
    private int bunnyNumber;
    private String name;
    
    

    public Bunny(String name) {
        this.name = name;
    }

    public Bunny(String name, int bunnyNumber) {
        this.name = name;
        this.bunnyNumber = bunnyNumber;
    }
    
    public int getBunnyNumber() {
        return bunnyNumber;   
    }

    public void setBunnyNumber(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String hop(){
        this.bunnyNumber+=bunnyNumber-1;
        return String.format(" is gerbil number: "+ bunnyNumber +" is hopping!");
                
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.bunnyNumber;
        hash = 89 * hash + Objects.hashCode(this.name);
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
        final Bunny other = (Bunny) obj;
        if (this.bunnyNumber != other.bunnyNumber) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

   

    @Override
    public String toString() {
        return String.format(name);
    }
    
    
}
