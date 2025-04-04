// Order Management System with Multilevel Inheritance in Java
package OnlineRetailOrderManagement;

class Order {
    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + ", Shipped with tracking number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + ", Delivered on: " + deliveryDate;
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-04-01");
        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-04-02", "TRK123456");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-04-03", "TRK654321", "2025-04-05");
        
        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
