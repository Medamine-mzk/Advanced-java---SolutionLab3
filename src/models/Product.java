import java.util.Date;

public class Product {
    // Attributes
    private int id;
    private String label;
    private String brand;
    private double price;
    private Date expirationDate;

    // 1) Constructor to create an empty product
    public Product() {
        this.id = 0;
        this.label = "";
        this.brand = "";
        this.price = 0.0;
    }

    // 2) Constructor to create a product with specified attributes
    public Product(int id, String label, String brand, double price) {
        this.id = id;
        this.label = label;
        this.brand = brand;
        this.price = price;
    }

    // Getter and Setter methods for attributes
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    // 3) Method to display product details
    public void display() {
        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Label: " + label);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        if (expirationDate != null) {
            System.out.println("Expiration Date: " + expirationDate);
        } else {
            System.out.println("Expiration Date: Not Set");
        }
        System.out.println("------------------------");
    }

}
