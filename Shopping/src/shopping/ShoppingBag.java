package shopping;

import java.util.ArrayList;

public class ShoppingBag {
    
    private ArrayList<Object> items; // A list to store items in the shopping bag.
    
    // Constructor to initialize an empty shopping bag.
    public ShoppingBag(){
        items = new ArrayList<Object>();
    }
    
    // Method to add an item to the shopping bag.
    public void buyItem(Object someItem){
        this.items.add(someItem);
    }
    
    // Method to empty the shopping bag and return a list of items removed.
    public String emptyBag(){
        String itemList = "";
        
        // Iterate through the items in the shopping bag and create a string representation.
        for(Object item: this.items){
            itemList = itemList + item.toString() + "\n";
        }
        
        // Clear the shopping bag.
        this.items.clear();
        
        // Return the list of items that were removed from the shopping bag.
        return itemList;
    }
    
    // Getter method to retrieve the list of items in the shopping bag.
    public ArrayList<Object> getItems() {
        return items;
    }
}
