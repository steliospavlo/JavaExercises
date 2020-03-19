package classexercise193computer;


public class Tablet  extends Computer{
    
    private boolean hasBluetooth;
    
    public Tablet(double price) {
        super("unknown", price); // ή this(price) επειδη δεν εχουμε μεταβλητη price σε αυτη τη κλαση
        hasBluetooth = false;
    }

    public Tablet(String brand, double price, boolean hasBluetooth) {
        super(brand, price);
        this.hasBluetooth = hasBluetooth;
        setPrice(price);
    }
    
    public void setPrice(double price){
        if(hasBluetooth == true){
            this.price = price + 50;
        }
    }
}
