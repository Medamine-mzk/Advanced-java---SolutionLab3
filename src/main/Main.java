package main;

import models.Product;
import models.Store;

import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1021, "Milk", "Delight", 0.700);
        Product p2 = new Product(2510, "Yogurt", "Vitalait", 1.200);
        Product p3 = new Product(3250, "Tomato", "Sicam", 0.900);

        Store store1 = new Store(1, "Downtown", 50);
        Store store2 = new Store(2, "Uptown", 50);

        store1.addProduct(p1);
        store1.addProduct(p2);
        store2.addProduct(p2);
        store2.addProduct(p3);

        System.out.println("Store 1 has product p1: " + store1.searchProduct(p1));
        System.out.println("Store 2 has product p1: " + store2.searchProduct(p1));

        store1.removeProduct(p1);
        System.out.println("After removal, Store 1 has product p1: " + store1.searchProduct(p1));

        Store largerStore = Store.compareStores(store1, store2);
        System.out.println("The store with more products is: " + largerStore.getId());
    }
}
