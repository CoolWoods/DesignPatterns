package factory.simplefactory;

public class Client {
    public static void main(String[] args) {
        ShapeSimpleFactory simpleFactory = new ShapeSimpleFactory();
        Shape circle = simpleFactory.getShape("circle");
        Shape square = simpleFactory.getShape("square");
        circle.draw();
        square.draw();
    }
}
