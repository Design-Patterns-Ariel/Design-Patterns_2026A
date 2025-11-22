package Week02.Threads;

public class OneThread {

    public static void main(String[] args) {
        func1();
        func2();
        System.out.println("Hello main");
    }

    private static void func1() {
        System.out.println("func1");
    }
    private static void func2() {

        while(true){

        }
    }
}
