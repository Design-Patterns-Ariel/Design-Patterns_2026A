package Week05;

public class Test {

    private int anInt1;
    private int anInt2;
    private int anInt3;
    private int anInt4;
    private int anInt5;
    private int anInt6;
    private int anInt7;
    private int anInt8;
    private int anInt9;
    private int anInt10;
    private int anInt11;
    private int anInt12;
    private int anInt13;
    private int anInt14;
    private int anInt15;
    private int anInt16;
    private int anInt17;
    private int anInt18;
    private int anInt19;
    private int anInt20;
    private int anInt21;
    private int anInt22;

    public Test(TestBuilder testBuilder) {
        this.anInt1 = testBuilder.anInt1;
    }

    static class TestBuilder {

        private int anInt1;
        private int anInt2;


        private int anInt3;
        private int anInt4;
        private int anInt5;
        private int anInt6;
        private int anInt7;
        private int anInt8;
        private int anInt9;
        private int anInt10;
        private int anInt11;
        private int anInt12;
        private int anInt13;
        private int anInt14;
        private int anInt15;
        private int anInt16;
        private int anInt17;
        private int anInt18;
        private int anInt19;
        private int anInt20;
        private int anInt21;
        private int anInt22;

        public TestBuilder(int anInt1, int anInt2) {
            this.anInt1 = anInt1;
            this.anInt2 = anInt2;
        }

        public TestBuilder setAnInt3(int anInt3) {
            this.anInt3 = anInt3;
            return this;
        }

        public TestBuilder setAnInt4(int anInt4) {
            this.anInt4 = anInt4;
            return this;
        }

        public TestBuilder setAnInt5(int anInt5) {
            this.anInt5 = anInt5;
            return this;
        }

        public Test build() {
            return new Test(this);
        }
    }
}

class MainT {


    public static void main(String[] args) {
        Test test = new Test.TestBuilder(1, 2).setAnInt3(3).setAnInt4(5).setAnInt5(6).build();
    }
}