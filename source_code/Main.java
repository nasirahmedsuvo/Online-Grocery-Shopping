import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // User 

        // Creating User
        User user = new User(1, "Robert Downey Jr", "rdj@gmail.com", "I'mIronMan");
        user.Resister();

        // Log In
        if(user.Login("rdj@gmail.com", "I'mIronMan")){
            System.out.println("\nUser Logged In\n");
        }




        //Product 

        // Creating instances of Product
        Product product1 = new Product(1, "Laptop", 999.99f, "Electronics", 10);
        Product product2 = new Product(2, "Smartphone", 599.99f, "Electronics", 20);

                // Add productS
                product1.addProduct();
                product2.addProduct();

        // View product details
        System.out.println("\nViewing Product Details:");
        product1.viewProduct();
        System.out.println();
        product2.viewProduct();


        // Updating availability
        System.out.println("\nUpdating Availability:");
        product1.updateAvailability(-2); 
        product2.updateAvailability(5);  



        // View updated details
        System.out.println("\nUpdated Product Details:");
        product1.viewProduct();
        System.out.println();
        product2.viewProduct();


        // Add product to cart
        Cart cart = new Cart(1);
        cart.addItem(product);
        System.out.println("Total Price is: " + cart.getTotalPrice());

    

        //Creating an order
        Order order = new Order(1, new Date(), "Pending", 999.00);
        order.placeOrder();


        //payment 

        //Creating a payment
        Payment payment = new Payment(1, 999.00f, "Credit Card");
        payment.processPayment();

        
        //delivery
        //delivering the order
        Delivery delivery = new Delivery(1, "123 Main St", "Delivered");
        delivery.updateStatus("Delivered");
        
    }


    
}
