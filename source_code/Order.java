import java.util.Date;

public class Order {
    private int orderID;
    private Date orderDate;
    private String status;
    private float totalAmmount;

    public Order(int orderID, Date orderDate, String status, float totalAmmount){
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.status = status;
        this.totalAmmount = totalAmmount;
    }

    public void placeOrder(){
        System.out.println("Your order has heen placed");
    }
}
