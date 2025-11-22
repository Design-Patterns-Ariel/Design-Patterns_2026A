package Exceptions;

public class Main {


    public static void main(String[] args) throws ArithmeticException{
        int a = 1, b = 6;
        float c = divByZero(a, b);
        System.out.println("output -> " + c);

        b = 0;
        c = divByZero(a, b);
        System.out.println("output -> " + c);


        b = 0;
        c = 77;
        try {
            c = DivByZero(a, b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        } catch (Exception e1) {

        }
        c = DivByZero(a, b);
        System.out.println("output -> " + c);

    }

    private static float divByZero(int a, int b) {
        int c = 0;
        try {
            System.out.println("try");
            return (float) a / b;
        } catch (ArithmeticException e) {
            System.out.println("cat");
            e.printStackTrace();
            return 3;
        }
    }

    private static float DivByZero(float a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {

        if (b == 0)
            throw new ArithmeticException("div by zero");
        int[] arr = new int[0];
        arr[1] = 7;
        return a / b;

    }

}
