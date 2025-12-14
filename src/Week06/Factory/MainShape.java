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

class A {
    Shape s;

    public A() {
        this.s = new Circle();
        this.s =  ShapeFactory.create("circle") ;
    }
}

class B {
    Shape s;

    public B() {
        this.s = new Circle();
        this.s =  ShapeFactory.create("circle") ;
    }
}

class C {
    Shape s;

    public C() {
        this.s = new Circle();
        this.s =  ShapeFactory.create("circle") ;
    }
}

class D {
    Shape s;

    public D() {
        this.s = new Circle();
        this.s =  ShapeFactory.create("circle") ;
    }
}

class F {
    Shape s;

    public F() {
        this.s = new Circle();
        this.s =  ShapeFactory.create("circle") ;
    }
}

