
package classexercise193computer;

import java.util.ArrayList;


public abstract class Computer {
    private String brand;
    protected double price;
    private static int ComputersCreated;
    
    private Computer(double price){
        this.price = price;
        ComputersCreated++;
    }
    
    public Computer(String brand, double price){
        this(price);
        this.brand = brand;
    }
    
    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }
    
    public double getPrice(){
        return price;
    }

    public abstract void setPrice(double price);

    public static int getComputersCreated() {
        return ComputersCreated;
    }
    
}
