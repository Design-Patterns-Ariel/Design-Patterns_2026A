package Week09;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        A[] arr = new A[100];
        for (int i = 0; i < arr.length; i++) {
            int num = new Random().nextInt(5);
            switch (num) {
                case 0:
                    arr[i] = new A();
                    break;
                case 1:
                    arr[i] = new B();
                    break;
                case 2:
                    arr[i] = new C();
                    break;
                case 3:
                    arr[i] = new D();
                    break;
                case 4:
                    arr[i] = new E();
                    break;
                default:
                    arr[i] = new A();
            }
        }
        int index = new Random().nextInt(100);
        arr[index].f();


    }
}
