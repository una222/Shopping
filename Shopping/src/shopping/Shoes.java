package shopping;

public class Shoes extends Clothing {
    
    // Constructor to initialize a Shoes object.
    public Shoes(String type, double price, String size, int quantity) {
        super(type, price, size, quantity); // Call the constructor of the parent class (Clothing).
    }

    // Override the display method from the parent class (Clothing).
    // This method is used to display the details of the shoes.
    @Override
    public void display() {
        super.display(); // Call the display method of the parent class (Clothing) to display common clothing details.
    }
}
