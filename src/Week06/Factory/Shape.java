package Week06.Factory;


class ShapeFactory {
    static int D_lINE = 2;

    public static Shape create(String type) {

        return switch (type.toLowerCase()) {
            case "rectangle" -> new Rectangle();
            case "triangle" -> new Triangle();
            case "circle" -> new Circle();
            case "line" -> new Line();
            default -> throw new IllegalArgumentException();
        };

    }

    public static Shape createByGroup(String type, String group) {

        return switch (group.toLowerCase()) {
            case "rectangle" -> switch (type.toLowerCase()) {
                case "rectangle" -> new Rectangle();
                default -> throw new IllegalArgumentException();
            };
            case "triangle" -> switch (type.toLowerCase()) {

                case "triangle" -> new Triangle();

                default -> throw new IllegalArgumentException();
            };
            case "circle" -> switch (type.toLowerCase()) {

                case "circle" -> new Circle();
                default -> throw new IllegalArgumentException();
            };
            default -> throw new IllegalArgumentException();
        };


    }


}


public abstract class Shape {
    int linePx = ShapeFactory.D_lINE;


    public abstract void draw();

}


class Circle extends Shape {
    int linePx = ShapeFactory.D_lINE;
    int r;

    public Circle(int linePx) {
        this.linePx = linePx;
    }

    public Circle(int linePx, int r) {
        this.linePx = linePx;
        this.r = r;
    }

    public Circle() {
        this.r = 2;
        this.linePx = 3;
    }

    @Override
    public void draw() {

    }
}

class Rectangle extends Shape {


    @Override
    public void draw() {

    }
}

class Triangle extends Shape {


    @Override
    public void draw() {

    }
}