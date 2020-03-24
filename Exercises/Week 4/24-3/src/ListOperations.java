
package mypackage;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    private List<String> names;
    
    public boolean addNameToList(String name){
        boolean result = false;   //local variables do not have default values, only instance and static variables do
        if(names == null){
            names = new ArrayList();
        }
        if(name != null){
            result = names.add(name);
            return result;
        }
        return result;
    }

    public List<String> getNames() {
        return names;
    }

    public void removeNameToList(String name){
        names.remove(name);
    }
    
    public int getSizeOfList(){
        return names.size();
    }
}
