import java.util.Date;

public class Order {
    private int orderID;
    private Date orderDate;
    private String status;
    private double totalAmmount;

    public Order(int orderID, Date orderDate, String status, double totalAmmount){
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.status = status;
        this.totalAmmount = totalAmmount;
    }

    public void placeOrder(){
        System.out.println("\nYour order has heen placed");
    }

    public void cancelOrder(){
        System.out.println("\nYour order has heen canceled");
    } 

    
}
