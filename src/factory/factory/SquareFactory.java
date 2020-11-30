package factory.factory;

public class SquareFactory implements ShapeFactory{
    @Override
    public Shape getShape() {
        return new Square();
    }
}
