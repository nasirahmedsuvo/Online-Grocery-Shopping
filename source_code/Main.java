public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Robert Downey Jr", "rdj@gmail.com", "I'mIronMan");
        user.Resister();

        if(user.Login("rdj@gmail.com", "I'mIronMan")){
            System.out.println("User Logged In");
        }




        //Product 

        // Creating instances of Product
        Product product1 = new Product(1, "Laptop", 999.99f, "Electronics", 10);
        Product product2 = new Product(2, "Smartphone", 599.99f, "Electronics", 20);

                // Add productS
                product1.addProduct();
                product2.addProduct();



    }

    
}
