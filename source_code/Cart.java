import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int cartId;
    private List<Product> items;
    private float totalPrice;

    public Cart(int cartId) {
        this.cartId = cartId;
        this.items = new ArrayList<>();
        this.totalPrice = 0.0f;
    
   }
   public void addItem(Product product) {
    items.add(product);
    calculateTotal();
    System.out.println("Product added to cart.");
}
public void removeItem(Product product) {
    items.remove(product);
    calculateTotal();
    System.out.println("Product removed from cart.");
}
public void calculateTotal() {
    totalPrice = 0;
    for (Product item : items) {
        totalPrice += item.getPrice();
    }
}
public float getTotalPrice() {
    return totalPrice;
}

}

