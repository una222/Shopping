package shopping;

public class Clothing {
    private String type;     // The type of clothing (e.g., shirt, pants).
    private double price;    // The price of one unit of this clothing item.
    private String size;     // The size of the clothing (e.g., small, medium, large).
    private int quantity;    // The quantity of this clothing item in the shopping bag.

    // Constructor to initialize a Clothing object.
    public Clothing(String type, double price, String size, int quantity) {
        this.type = type;
        this.price = price;
        this.size = size;
        this.quantity = quantity;
    }

    // Getter method for retrieving the type of clothing.
    public String getType() {
        return type;
    }

    // Setter method for setting the type of clothing.
    public void setType(String type) {
        this.type = type;
    }

    // Getter method for retrieving the price of one unit of clothing.
    public double getPrice() {
        return price;
    }

    // Setter method for setting the price of one unit of clothing.
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter method for retrieving the size of the clothing.
    public String getSize() {
        return size;
    }

    // Setter method for setting the size of the clothing.
    public void setSize(String size) {
        this.size = size;
    }
  
    // Getter method for retrieving the quantity of this clothing item.
    public int getQuantity() {
        return quantity;
    }

    // Setter method for setting the quantity of this clothing item.
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Display method to print the details of the clothing item.
    public void display() {
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Quantity: " + quantity);
    }
}
