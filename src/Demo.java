import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Orders order1 = new Orders("ODR0001", 2,OrderStatus.PROCESSING);
        Orders order2 = new Orders("ODR0002", 3,OrderStatus.DELIVERING);
        Orders order3 = new Orders("ODR0003", 5, OrderStatus.DELIVERED);
        for (Orders orders : Arrays.asList(order1, order2, order3)) {
            System.out.println(orders.toString());
        }
    }
}
enum OrderStatus{
    PROCESSING,DELIVERING,DELIVERED
}
class Orders{
    String orderId;
    int customerId;
    OrderStatus orderStatus;
    public Orders(String orderId, int customerId, OrderStatus orderStatus) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderStatus = orderStatus;
    }
    @Override
    public String toString() {
        return "Order Id is " + orderId +
               ", Customer Id is " + customerId +
               " and Order Status is " + orderStatus;
    }
}