

package mypackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Main {

    
    public static void main(String[] args) {
        
        
        //1)
        ArrayList<Bunny> bunnies = new ArrayList();
        Bunny a = new Bunny("Fluffy", 1);
        bunnies.add(a);
        Bunny b = new Bunny("Duffy", 2);
        bunnies.add(b);
        Bunny c = new Bunny("Cutie", 3);
        bunnies.add(c);
        Bunny d = new Bunny("Pie", 4);
        bunnies.add(d);
        Bunny e = new Bunny("Carrot", 5);
        bunnies.add(e);
        
        for(int i=0; i<bunnies.size(); i++){
            System.out.println(bunnies.get(i) + a.hop());
        }
        
        Set<Bunny> bunniez = new HashSet();
        bunniez.add(bunnies.get(0));
        bunniez.add(bunnies.get(1));
        bunniez.add(bunnies.get(2));
        bunniez.add(bunnies.get(3));
        bunniez.add(bunnies.get(4));

        Iterator<Bunny> iterator = bunniez.iterator();
        while(iterator.hasNext()){
            Bunny bunniez2 = iterator.next();
        }
        System.out.println(bunniez);
        
        System.out.println("*****2*****");
        
        Map<String, Integer> map = new HashMap();
        map.put(a.getName(), a.getBunnyNumber());
        map.put(b.getName(), b.getBunnyNumber());
        map.put(c.getName(), c.getBunnyNumber());
        map.put(d.getName(), d.getBunnyNumber());
        map.put(e.getName(), e.getBunnyNumber());
        
        System.out.println(map);
        
         // μιση δουλεια ειναι, στην αρχη μου εβγαινε αλλα μετα κατι πειραξα και δεν μπορουσα να καταλαβω τι και τα παρατησα   
        

    }

}
