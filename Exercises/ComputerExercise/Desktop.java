package classexercise193computer;


public class Desktop  extends Computer{
    
    private boolean hasExtraLight;
    
    public Desktop(double price) {
        super("unknown",price);
        hasExtraLight = false;
    }

    public Desktop(String brand, double price, boolean hasExtraLight) {
        super(brand, price);
        this.hasExtraLight = hasExtraLight;
        setPrice(price);
    }
    
    public void setPrice(double price){
        if(hasExtraLight == true){
            this.price = price + 10;
        }
    }
    
}
