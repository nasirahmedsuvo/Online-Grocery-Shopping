public class Delivery {
    private int deliveryId;
    private String address;
    private String deliveryStatus;

    public Delivery(int deliveryId, String address, String deliveryStatus) {
        this.deliveryId = deliveryId;
        this.address = address;
        this.deliveryStatus = deliveryStatus;
    }

    public void updateStatus(String status) {
        this.deliveryStatus = status;
        System.out.println("Delivery status updated to: " + status);
    }
}
