package Week05.Builder;


public class Car {
    //required parameters
    private int yearModel;
    private String brand;
    private int numberModel;
    private Engine engine;

    //optional parameters
    private int priceModel;
    private int test;

    public Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.yearModel = builder.yearModel;
        this.brand = builder.brand;
        this.numberModel = builder.numberModel;

        this.priceModel = builder.priceModel;
        this.test = builder.test;

    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberModel() {
        return numberModel;
    }

    public void setNumberModel(int numberModel) {
        this.numberModel = numberModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getPriceModel() {
        return priceModel;
    }

    public void setPriceModel(int priceModel) {
        this.priceModel = priceModel;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public int getYear() {

        return yearModel;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return priceModel;
    }

    public int getNumber() {
        return numberModel;
    }

    static class CarBuilder {
        //required parameters
        private int yearModel;
        private String brand;
        private int numberModel;
        private Engine engine;

        //optional parameters
        private int priceModel;
        private int test;

        public CarBuilder(int yearModel, String brand, int numberModel, Engine engine) {
            this.yearModel = yearModel;
            this.brand = brand;
            this.numberModel = numberModel;
            this.engine = engine;
        }

        public CarBuilder setPriceModel2(int priceModel) {
            this.priceModel = priceModel;
            return this;
        }

        public CarBuilder setTest2() {
            this.test = 10;
            return this;
        }

        public CarBuilder setPriceModel3(int priceModel) {
            this.priceModel = (int) (priceModel * 0.16);
            return this;
        }

        public CarBuilder setTest3() {
            this.test = 10;
            return this;
        }

        public CarBuilder setPriceModel4(int priceModel) {
            this.priceModel = priceModel;
            return this;
        }

        public CarBuilder setTest4() {
            this.test = 10;
            return this;
        }

        public CarBuilder setPriceModel(int priceModel) {
            this.priceModel = priceModel;
            return this;
        }

        public CarBuilder setTest() {
            this.test = 10;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

}

class Engine {
}


class TestCar {


    public static void main(String[] args) {
        Car.CarBuilder carBuilder = new Car.CarBuilder(2012, "Audi", 3, new Engine());
        Car car = new Car(carBuilder);
        Car car2 = carBuilder.build();

        while (true) {
            carBuilder = carBuilder.setTest2();
            if (true)
                break;
        }
        carBuilder.build();

    }
}
//
//
//class TestCar {
//
//    public static void main(String[] args) {
//
//
//        Car.CarBuilder carBuilder = new Car.CarBuilder(2012, "Audi", 3, new Engine());
//        Car new_car = new Car(carBuilder);
//
//        Car.CarBuilder carBuilder1 = new Car.CarBuilder(2012, "Audi", 3, new Engine()).setPriceModel(100);
//        Car new_car1 = new Car(carBuilder1);
//
//        Car.CarBuilder carBuilder2 = new Car.CarBuilder(2012, "Audi", 3, new Engine()).setPriceModel(100).setTest();
//        Car new_car2 = new Car(carBuilder2);
//
//
//        Car car = new Car.CarBuilder(2012, "Audi", 3, new Engine()).setPriceModel(150000).setTest().build();
//
//        Car testCar = new Car.CarBuilder(2012, "Audi", 3, new Engine())
//                .setTest()
//                .setTest2()
//                .setTest4()
//                .setPriceModel(100)
//                .setPriceModel3(50)
//                .build();
//    }
//}