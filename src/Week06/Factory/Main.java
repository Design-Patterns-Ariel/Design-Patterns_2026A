package Week06.Factory;

public class Main {

    public static void main(String[] args) {

        BadOrder badOrder = new mobileOrder();
        badOrder = new webOrder();
        badOrder = new physicalOrder();

        badOrder = BadOrder.createOrder("mobile");
        badOrder = BadOrder.createOrder("web");
        badOrder = BadOrder.createOrder("physical");


        Order order = FactoryCreator.createOrder("mobile");
        order = FactoryCreator.createOrder("web");
        order = FactoryCreator.createOrder("physical");


    }
}
