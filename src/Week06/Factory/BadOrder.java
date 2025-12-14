package Week06.Factory;


public class BadOrder {

    public void process() {
        System.out.println("processing Order");
    }

    public static BadOrder createOrder(String type) {

        switch (type) {
            case "mobile":
                return new mobileOrder();
            case "web":
                return new webOrder();
            case "physical":
                return new physicalOrder();
            default:
                throw new IllegalArgumentException();
        }
    }
}

class digitalOrder extends BadOrder {
    public void process() {
        System.out.println("processing digital Order");
    }
}

class webOrder extends digitalOrder {
    public void process() {
        System.out.println("processing web Order");
    }
}

class mobileOrder extends digitalOrder {
    public void process() {
        System.out.println("processing mobile Order");
    }
}

class physicalOrder extends BadOrder {
    public void process() {
        System.out.println("Processing PhysicalOrder");
    }
}
