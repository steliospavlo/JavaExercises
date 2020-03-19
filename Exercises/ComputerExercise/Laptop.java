package classexercise193computer;

public class Laptop extends Computer {

    private boolean hasWifi;
    
    public Laptop(double price) {
        super("unknown",price);
        hasWifi = false;
    }

    public Laptop(String brand, double price, boolean hasWifi) {
        super(brand, price);
        this.hasWifi = hasWifi;
        setPrice(price);
    }
    
    public void setPrice(double price){
        if(hasWifi == true){
            this.price = price + 20;
        }
    }

}
