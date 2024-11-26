import models.Product;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // 1) Create an empty product
        Product emptyProduct = new Product();
        emptyProduct.display();

        // 2) Create new products with specified characteristics
        Product milk = new Product(1021, "Milk", "Delight", 0.0);
        Product yogurt = new Product(2510, "Yogurt", "Vitalait", 0.0);
        Product tomato = new Product(3250, "Tomato", "Sicam", 1.200);

        // Display initial product details
        milk.display();
        yogurt.display();
        tomato.display();

        // 4) Assign a price to the milk product and display it
        milk.setPrice(0.700);
        milk.display();

        // 5) Complete the missing information for each product
        yogurt.setPrice(0.500);
        tomato.setPrice(1.200);

        // 6) Display modified products
        yogurt.display();
        tomato.display();

        // 7) Display products using the toString() method
        System.out.println(milk);
        System.out.println(yogurt);
        System.out.println(tomato);

        // 8) Add an expiration date attribute and assign dates to existing products
        milk.setExpirationDate(new Date(2024, 11, 20));  // Example date
        yogurt.setExpirationDate(new Date(2024, 11, 25));  // Example date
        tomato.setExpirationDate(new Date(2025, 1, 15));  // Example date

        // Display products with expiration dates
        milk.display();
        yogurt.display();
        tomato.display();
    }
}