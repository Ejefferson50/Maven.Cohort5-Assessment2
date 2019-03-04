package rocks.zipcode.assessment2.collections;

import com.sun.tools.javac.jvm.Items;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    TreeMap<String,Integer> inventory = new TreeMap<>();

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
       // Map<String, Integer> map = strings.stream().
         //       collect(Collectors.toMap



    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {


    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {

        inventory.put(item,1);


    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item){
        inventory.remove(item);

    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {

        return inventory.get(item);
    }
}
