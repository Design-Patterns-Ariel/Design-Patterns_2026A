package Week05.Builder;

class L07 {

    public static void main(String[] args) {
        A a = new A();
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();

        Computer comp2 = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(false)
                .setCamera(false).setKey(true).setPix(3050).build();
    }
}

class A {

    private int a;
    private int a1;
    private int a2;
    private int a3;
    private int a4;
    private int a5;
    private int a6;
    private int a7;
    private int a8;
    private int a9;
    private int a11;
    private int a12;
    private int a13;
    private int a14;
    private int a15;
    private int a10;
    private int a16;
    private int a17;
    private int a18;


    public A() {
    }

    public A(int a, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a11, int a12, int a13, int a14, int a15, int a10, int a16, int a17, int a18) {
        this.a = a;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.a9 = a9;
        this.a11 = a11;
        this.a12 = a12;
        this.a13 = a13;
        this.a14 = a14;
        this.a15 = a15;
        this.a10 = a10;
        this.a16 = a16;
        this.a17 = a17;
        this.a18 = a18;
    }

    public A(int a, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a11, int a12, int a13, int a14, int a15, int a10, int a16, int a17) {
        this.a = a;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
        this.a7 = a7;
        this.a8 = a8;
        this.a9 = a9;
        this.a11 = a11;
        this.a12 = a12;
        this.a13 = a13;
        this.a14 = a14;
        this.a15 = a15;
        this.a10 = a10;
        this.a16 = a16;
        this.a17 = a17;

    }
}


public class Computer {

    //required parameters
    private String HDD;
    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    private boolean cpu;
    private boolean alu;
    private boolean key;
    private boolean screen;
    private boolean camera;
    private int pix;


    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.cpu = builder.cpu;
        this.alu = builder.alu;
        this.key = builder.key;
        this.screen = builder.screen;
        this.camera = builder.camera;
        this.pix = builder.pix;
    }


    //Builder Class
    public static class ComputerBuilder {

        // required parameters
        private String HDD;
        private String RAM;

        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;
        private boolean cpu;
        private boolean alu;
        private boolean key;
        private boolean screen;
        private boolean camera;
        private int pix;

        public ComputerBuilder setPix(int pix) {
            this.pix = pix;
            return this;
        }

        public ComputerBuilder setCpu(boolean cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setAlu(boolean alu) {
            this.alu = alu;
            return this;
        }

        public ComputerBuilder setKey(boolean key) {
            this.key = key;
            return this;
        }

        public ComputerBuilder setScreen(boolean screen) {
            this.screen = screen;
            return this;
        }

        public ComputerBuilder setCamera(boolean camera) {
            this.camera = camera;
            return this;
        }

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

}