package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        // Create a shopping bag to store items
        ShoppingBag myBag = new ShoppingBag();

        // Display the main shopping menu
        displayMenu();
        
        // Start the shopping process
        buyItems(myBag);
        
        // End the shopping and calculate the total cost
        endShopping(myBag);
    }

    // Display the main shopping menu
    private static void displayMenu() {
        System.out.println("Welcome to Chic & Chair!");
        System.out.println("Offers! Enjoy a 10% discount on all furniture!");
        System.out.println("1. Buy Clothing");
        System.out.println("2. Buy Shoes");
        System.out.println("3. Buy Furniture");
        System.out.println("4. Empty the bag");
        System.out.println("5. Leave Shop");
    }
    // Handle the process of buying items
    private static void buyItems(ShoppingBag bag) {
        Scanner scanner = new Scanner(System.in);
        boolean shopping = true;

        while (shopping) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Buy clothing and add it to the shopping bag
                    buyClothing(bag, scanner);
                    break;
                case 2:
                    // Buy shoes and add them to the shopping bag
                    buyShoes(bag, scanner);
                    break;
                case 3:
                    // Buy furniture and add it to the shopping bag
                    buyFurniture(bag, scanner);
                    break;
                case 4:
                    // Empty the shopping bag
                    bag.emptyBag();
                    System.out.println("The bag has been emptied.");
                    break;
                case 5:
                    // Exit the shopping loop
                    shopping = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
    // Handle the process of buying clothing
    private static void buyClothing(ShoppingBag bag, Scanner scanner) {
        System.out.print("Enter the type: ");
        String type = scanner.next();
        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter the size: ");
        String size = scanner.next();
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Create a clothing object and add it to the shopping bag
        Clothing clothing = new Clothing(type, price, size, quantity);
        bag.buyItem(clothing);
    }
    // Handle the process of buying shoes
    private static void buyShoes(ShoppingBag bag, Scanner scanner) {
        System.out.print("Enter the type: ");
        String type = scanner.next();
        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter the size: ");
        String size = scanner.next();
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Create a shoes object and add it to the shopping bag
        Shoes shoes = new Shoes(type, price, size, quantity);
        bag.buyItem(shoes);
    }
    // End the shopping process and calculate the total cost
    private static void buyFurniture(ShoppingBag bag, Scanner scanner) {
        System.out.print("Enter the type: ");
        String type = scanner.next();
        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        Furniture furniture = new Furniture(type, price, quantity);
        bag.buyItem(furniture);
    }

    private static void endShopping(ShoppingBag bag) {
    System.out.println("---------------------------");
    System.out.println("Items purchased:");
    System.out.println("---------------------------");

    double totalCost = 0.0;

    ArrayList<Object> items = bag.getItems();
    for (Object item : items) {
        if (item instanceof Clothing) {
            Clothing clothing = (Clothing) item;
            System.out.println("Type: " + clothing.getType());
            System.out.println("Price: €" + clothing.getPrice());
            System.out.println("Size: " + clothing.getSize());
            System.out.println("Quantity: " + clothing.getQuantity());
            totalCost += clothing.getPrice() * clothing.getQuantity();
        } else if (item instanceof Furniture) {
            Furniture furniture = (Furniture) item;
            System.out.println("Type: " + furniture.getType());
            double discountedPrice = furniture.getPrice() * 0.9;
            System.out.println("Discounted Price: €" + discountedPrice);
            System.out.println("Quantity: " + furniture.getQuantity());
            totalCost += discountedPrice * furniture.getQuantity();
        }

        System.out.println("--------------------------");
    }

    System.out.println("Total Cost: €" + totalCost);
    System.out.println("Thank you for shopping with us!");
}
}
