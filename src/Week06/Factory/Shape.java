package Week06.Factory;


class ShapeFactory {



    public static Shape create(String type) {

        return switch (type.toLowerCase()) {
            case "rectangle" -> new Rectangle();
            case "triangle" -> new Triangle();
            case "circle" -> new Circle();
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

    public abstract void draw();

}


class Circle extends Shape {


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