package Week06.Factory;

import java.util.Scanner;

public class MainShape {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Shape shape = null;
        // ---------------------(z-1)----------------------
        String s = sc.nextLine();
        shape = ShapeFactory.create(s);

        // ---------------------(z-2)----------------------
        shape = ShapeFactory.create(s);

        // ---------------------(z-3)----------------------
        shape = ShapeFactory.create(s);

        // ---------------------(z-4)----------------------
        shape = ShapeFactory.create(s);
        // ---------------------(z-5)----------------------
        shape = ShapeFactory.create(s);
        // ---------------------(z-6)----------------------
        shape = ShapeFactory.create(s);
    }
    // ---------------------(z-7)----------------------


}

