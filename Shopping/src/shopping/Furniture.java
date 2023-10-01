package shopping;

public class Furniture {
    private String type;     // The type of furniture (e.g., chair, table).
    private double price;    // The price of one unit of this furniture item.
    private int quantity;    // The quantity of this furniture item in the shopping bag.

    // Constructor to initialize a Furniture object.
    public Furniture(String type, double price, int quantity) {
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter method for retrieving the type of furniture.
    public String getType() {
        return type;
    }

    // Getter method for retrieving the price of one unit of furniture.
    public double getPrice() {
        return price;
    }
    
    // Getter method for retrieving the quantity of this furniture item.
    public int getQuantity() {
        return quantity;
    }

    // Setter method for setting the quantity of this furniture item.
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Display method to print the details of the furniture item.
    public void display() {
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
