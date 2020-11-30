package factory.factory;


public class Client {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory squareFactory = new SquareFactory();
        Shape circle = circleFactory.getShape();
        Shape square = squareFactory.getShape();
        circle.draw();
        square.draw();
    }
}
