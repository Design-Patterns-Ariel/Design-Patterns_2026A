package Week02.Exception;

public class Test {

    public static void main(String[] args) {
        int z = 1;
        try {
            divi(3,3);
        } catch (ArithmeticException e1) {
            e1.printStackTrace();
            String a = e1.getMessage();
            System.out.println(a);
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
            e2.printStackTrace();
            System.out.println("Ex");
        } finally {
            System.out.println("Hello");
        }
//        System.out.println(z);
//        int a = 5, b = 6;
//        divi(a, b);

    }
    private static void divi(int a, int b) throws Exception {
        throw new Exception("mssss");
    }
}
