

public class Product {
    private int ProductId;
    private String name ;
    private float price;
    private String category;
    private int availability;

    public Product (int ProductId,String name,float pricee,String category,int availability) {

        this.ProductId = ProductId;
        this.name = name;
        this.price = price;
        this.category = category ;
        this.availability = availability;
    }

    public void addProduct(){
        System.out.println("Product Add : " + name);
    }


    public void updateAvailability(int quantity){
        this.availability += quantity;
        System.out.println("Updated availability for " + name + ": " + availability);
    }

    

    










}
