package Week06.Factory;


class FactoryCreator {
    public static Order createOrder(String type) {

        switch (type) {
            case "mobile":
                return new MobileOrder();
            case "web":
                return new WebOrder();
            case "physical":
                return new PhysicalOrder();
            default:
                throw new IllegalArgumentException();
        }
    }
}

interface Order {
     void process();
}

class DigitalOrder implements Order {
    public void process() {
        System.out.println("processing digital Order");
    }
}

class WebOrder extends DigitalOrder {
    public void process() {
        System.out.println("processing web Order");
    }
}

class MobileOrder extends DigitalOrder {
    public void process() {
        System.out.println("processing mobile Order");
    }
}

class PhysicalOrder implements Order {
    public void process() {
        System.out.println("Processing PhysicalOrder");
    }
}
