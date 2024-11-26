package models;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int id;
    private String address;
    private int capacity;
    private List<Product> products;

    public Store(int id, String address, int capacity) {
        this.id = id;
        this.address = address;
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Product> getProducts() {
        return products;
    }

    // 1) Add a product to the store
    public void addProduct(Product product) {
        if (!searchProduct(product) && products.size() < capacity) {
            products.add(product);
        } else {
            System.out.println("Product already exists or store capacity reached.");
        }
    }
    public boolean removeProduct(Product product) {
        return products.remove(product);
    }
    //Returns the store with the higher number of products.
    public static Store compareStores(Store store1, Store store2) {
        return store1.products.size() > store2.products.size() ? store1 : store2;
    }

    // 4) Calculate total number of products
    public int getTotalProducts() {
        return products.size();
    }

    // Display store details
    public void displayStoreDetails() {
        System.out.println("Store ID: " + id);
        System.out.println("Address: " + address);
        System.out.println("Capacity: " + capacity);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getLabel() + " | Price: " + product.getPrice());
        }
        System.out.println("Total Products: " + getTotalProducts());
    }
    // Search for a product in the store
    public boolean searchProduct(Product product) {
        for (Product p : products) {
            if (p.compare(product)) {
                return true;
            }
        }
        return false;
    }
}
