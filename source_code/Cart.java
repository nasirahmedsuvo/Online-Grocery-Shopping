import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int cartId;
    private List<Product> items;
    private float price;

    public Cart(int cartId) {
        this.cartId = cartId;
        this.items = new ArrayList<>();
        this.price = 0.0f;
    
   }
   public void addItem(Product product) {
    items.add(product);
    calculateTotal();
    System.out.println("\nProduct added to cart.");
}
public void removeItem(Product product) {
    items.remove(product);
    calculateTotal();
    System.out.println("Product removed from cart.");
}
public void calculateTotal() {
    price = 0;
    for (Product item : items) {
        price += item.getPrice();
    }
}
public float getPrice() {
    return price;
}
}
