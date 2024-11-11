
public class Product {
    private int productId;
    private String name;
    private float price;
    private String category;
    private int availability;

    public Product(int productId, String name, float price, String category, int availability) {

        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.availability = availability;
    }

    public void addProduct() {
        System.out.println("Product Add : " + name);
    }

    public void updateAvailability(int quantity) {
        this.availability += quantity;
        System.out.println("Updated availability for " + name + ": " + availability);
    }

    public void viewProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
        System.out.println("Availability: " + availability + " units");
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getAvailability() {
        return availability;
    }

}
