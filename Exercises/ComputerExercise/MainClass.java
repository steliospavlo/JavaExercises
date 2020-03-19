package classexercise193computer;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    /*    ##Example
1. Create abstract class Computer ("brand", "price", "getPrice()", "getBrand()", "setBrand()").
Only "setPrice()" will be abstract. Subclasses Laptop, Desktop, Tablet.
1a. Tablet has hasBluetooth: boolean
    Desktop has hasExtraLight: boolean
    Laptop has hasWifi: boolean
1b. Brand can be Sony, Acer, Asus, Lenovo.   
2. You can only specify "price", "brand" and extraCharacteristics while creating the object(use appropriate Constructors).
No class will have a default constructor.
All classes will have 2 constructors. One with "price" and one with "price-brand-extraCharacteristics".
2a. If any PC has any extra characteristics, then setPrice() will add 20$ to the price.
3. Make 10 objects and store to list.
4. Get the sum of prices according to "brand". Print sum of each brand and print total.
5.Modify the program so that user(main method) cannot change the brand of the computer.
6.Get the sum of prices according to "object type".
     */
    public static void main(String[] args) {
        String sony = "Sony";
        String acer = "Acer";
        String asus = "Asus";
        String lenovo = "Lenovo";

        Computer desktop1 = new Desktop(sony, 900, true);
        Computer laptop1 = new Laptop(acer, 700, true);
        Computer tablet1 = new Tablet(50);
        Computer desktop2 = new Desktop(sony, 1000, true);
        Computer laptop2 = new Laptop(acer, 750, true);
        Computer tablet2 = new Tablet(asus, 60, false);
        Computer desktop3 = new Desktop(900);
        Computer laptop3 = new Laptop(acer, 800, true);
        Computer tablet3 = new Tablet(asus, 45, false);
        Computer tablet4 = new Tablet(lenovo, 55, true);

        List<Computer> computers = new ArrayList();
        computers.add(desktop1);
        computers.add(laptop1);
        computers.add(tablet1);
        computers.add(desktop2);
        computers.add(laptop2);
        computers.add(tablet2);
        computers.add(desktop3);
        computers.add(laptop3);
        computers.add(tablet3);
        computers.add(tablet4);
        
        int sumSony = 0;
        int sumAcer = 0;
        int sumAsus = 0;
        int sumLenovo = 0;
        int sumUnknown = 0;
        int sumTotal = 0;

        for (Computer c : computers) {
            if (c.getBrand().equals(sony)) {
                sumSony += c.getPrice();
            } else if (c.getBrand().equals(acer)) {
                sumAcer += c.getPrice();        
            } else if (c.getBrand().equals(asus)) {
                sumAsus += c.getPrice();
            } else if (c.getBrand().equals(lenovo)) {
                sumLenovo += c.getPrice();
            } else {
                sumUnknown += c.getPrice();
            }
        }

        sumTotal = sumSony + sumAcer + sumAsus + sumLenovo + sumUnknown;
        System.out.printf("%s Computers cost %d$\n", sony, sumSony);
        System.out.printf("%s Computers cost %d$\n", acer, sumAcer);
        System.out.printf("%s Computers cost %d$\n", asus, sumAsus);
        System.out.printf("%s Computers cost %d$\n", lenovo, sumLenovo);
        System.out.printf("%s Computers cost %d$\n", "Unknown", sumUnknown);
        System.out.printf("%s Computers cost %d$\n", "Total", sumTotal);
        
        int sumLaptop = 0;
        int sumDesktop = 0;
        int sumTablet = 0;
        
        boolean isDesktop = laptop1 instanceof Desktop;
        boolean isLaptop = laptop1 instanceof Laptop;
        boolean isTablet = laptop1 instanceof Tablet;
        boolean isComputer = laptop1 instanceof Computer;
        boolean isObject = laptop1 instanceof Object;
        System.out.println("laptop1 isDesktop " + isDesktop);
        System.out.println("laptop1 isLaptop " + isLaptop);
        System.out.println("laptop1 isTablet " + isTablet);
        System.out.println("laptop1 isComputer " + isComputer);
        System.out.println("laptop1 isObject " + isObject);
        
        for (Computer c : computers){
            if (c instanceof Laptop){    // ελεγχει αν στη καρδια του ειναι το αντικειμενο ειναι Laptop
                sumLaptop += c.getPrice();
            } else if (c instanceof Desktop){
                sumDesktop += c.getPrice();
            } else if (c instanceof Tablet){
                sumTablet += c.getPrice();
            }
        }
        
        System.out.println("Computers that are laptops are "+sumLaptop);
        System.out.println("Computers that are desktops are "+sumDesktop);
        System.out.println("Computers that are tablets are "+sumTablet);
        
    }

}
