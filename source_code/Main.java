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
        Product product1 = new Product(1, "Pushti Atta 2kg", 130f, "Atta", 10);
        Product product2 = new Product(2, "PRAN Mushur Dal 1kg", 99f, "Dal", 20);


        // View product details
        System.out.println("\nViewing Product Details:");
        product1.viewProduct();
        System.out.println();
        product2.viewProduct();





        // Add product to cart
        Cart cart = new Cart(1);
        cart.addItem(product1);
        System.out.println("Total Price is: " + cart.getPrice());

    

        //Creating an order
        Order order = new Order(1, new Date(), "Pending", 130.00);
        order.placeOrder();


        //payment 

        //Creating a payment
        Payment payment = new Payment(1, 130.00f, "Credit Card");
        payment.processPayment();

        
        //delivery
        //delivering the order
        Delivery delivery = new Delivery(1, "123 Main St", "Delivered");
        delivery.updateStatus("Delivered");
        
    }


    
}
