package Week06.Factory;

public class Line extends Shape {


    public Line(int line) {
    }

    public Line() {
    }

    @Override
    public void draw() {

    }
}


class TestLine{


    public static void main(String[] args) {

        new Line(6);
        new Line(6);
        new Line(6);
        new Line(6);
        new Line(6);
        new Line(6);
        new Line(6);
        new Line(6);
        new Line(6);
        new Line(6);
        new Line(6);


        ShapeFactory.create("line");
        ShapeFactory.create("line");
        ShapeFactory.create("line");
        ShapeFactory.create("line");
        ShapeFactory.create("line");
        ShapeFactory.create("line");
        ShapeFactory.create("line");
        ShapeFactory.create("line");
        ShapeFactory.create("line");
        ShapeFactory.create("line");
        ShapeFactory.create("line");
        ShapeFactory.create("line");





    }
}