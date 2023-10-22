public class Program {

    public static void main(String[] args) {

        SaveOrder saveOrder = new SaveOrder();

        Order order = new Order(saveOrder.getClientName(), saveOrder.getProduct(), saveOrder.getQnt(), saveOrder.getPrice());

        OrderSaveFile orderSaveFile = new OrderSaveFile(order);

        orderSaveFile.orderSaveFile();
    }
}
